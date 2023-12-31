package io.confluent.demo.travel.producer;

import io.confluent.demo.travel.utils.ClientsUtils;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.apache.log4j.Logger;
import java.util.Properties;

public class ProducerApp {

    private static final Logger logger = Logger.getLogger(ProducerApp.class);
    private static Properties props;
    private String topic;

    ProducerApp(String propertiesFile) {
        try {
            props = ClientsUtils.loadConfig(propertiesFile);
            props.put("key.serializer", StringSerializer.class);
            props.put("value.serializer", "io.confluent.kafka.serializers.json.KafkaJsonSchemaSerializer");
            props.setProperty("auto.register.schemas", "false");
            props.setProperty("use.latest.version", "true");

            /* Key & secret to access the KMS
              Preferred method is to use environment variables:
                export AWS_ACCESS_KEY_ID=XXXX
                export AWS_SECRET_ACCESS_KEY=XXXX
              Otherwise you can pass them as properties in code:
                props.put("rule.executors._default_.param.access.key.id", "<AWS key>");
                props.put("rule.executors._default_.param.secret.access.key", "<AWS secret>");
            */

            topic = props.getProperty("purchase.orders.topic");

            // Create the topic if it doesn't exist already
            ClientsUtils.createTopic(props,topic);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Error in ProducerApp.constructor: " + e.getMessage());
        }
    }

    public void runProducer(String clientID) {
        try {

            // Set the Kafka client ID
            props.put(ProducerConfig.CLIENT_ID_CONFIG, clientID);

            // Create a producer
            Producer producer = new KafkaProducer<>(props);

            while (true) {
                    // Create a producer record
                    ProducerRecord record = new ProducerRecord<>(topic, PurchaseOrderDataGen.getNewPurchaseOrder());

                    // Send the record
                    producer.send(record);

                System.out.println("New purchase order " + record.value());

                Thread.sleep(1000);
            }
            // Close producer
            //producer.close();
        } catch (Exception e) {
            logger.error("Error in ProducerApp.runProducer method: ", e);
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for (StackTraceElement stackTrace : stackTraceElements) {
                logger.error(stackTrace.getClassName() + "  " + stackTrace.getMethodName() + " " + stackTrace.getLineNumber());
            }
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void main(final String[] args) throws Exception {
        int numArgs = args.length;
        if (numArgs < 2) {
            logger.error("Provide the properties file and client ID as arguments.");
            System.exit(1);
        } else {
            try {
                ProducerApp producer = new ProducerApp(args[0]);
                producer.runProducer(args[1]);
            } catch (Exception e) {
                logger.error("Error in ProducerApp.main method: " + e.getMessage());
            }
        }
    }
}
