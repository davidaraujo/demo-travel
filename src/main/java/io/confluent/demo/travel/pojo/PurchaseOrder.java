
package io.confluent.demo.travel.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.confluent.kafka.schemaregistry.annotations.Schema;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "contact",
    "fare",
    "flight",
    "itinerary",
    "passenger",
    "payment",
    "seat"
})
@Schema(value="{\n" +
        "  \"$schema\": \"http://json-schema.org/draft-07/schema#\",\n" +
        "  \"properties\": {\n" +
        "    \"contact\": {\n" +
        "      \"properties\": {\n" +
        "        \"email\": {\n" +
        "          \"format\": \"email\",\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        \"mailingAddress\": {\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        \"phoneNumber\": {\n" +
        "          \"type\": \"string\"\n" +
        "        }\n" +
        "      },\n" +
        "      \"required\": [\n" +
        "        \"email\",\n" +
        "        \"phoneNumber\",\n" +
        "        \"mailingAddress\"\n" +
        "      ],\n" +
        "      \"type\": \"object\"\n" +
        "    },\n" +
        "    \"fare\": {\n" +
        "      \"properties\": {\n" +
        "        \"ticketPrice\": {\n" +
        "          \"type\": \"number\"\n" +
        "        }\n" +
        "      },\n" +
        "      \"required\": [\n" +
        "        \"ticketPrice\"\n" +
        "      ],\n" +
        "      \"type\": \"object\"\n" +
        "    },\n" +
        "    \"flight\": {\n" +
        "      \"properties\": {\n" +
        "        \"arrivalAirport\": {\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        \"departureAirport\": {\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        \"departureDateTime\": {\n" +
        "          \"format\": \"date-time\",\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        \"flightNumber\": {\n" +
        "          \"type\": \"string\"\n" +
        "        }\n" +
        "      },\n" +
        "      \"required\": [\n" +
        "        \"departureAirport\",\n" +
        "        \"arrivalAirport\",\n" +
        "        \"departureDateTime\",\n" +
        "        \"flightNumber\"\n" +
        "      ],\n" +
        "      \"type\": \"object\"\n" +
        "    },\n" +
        "    \"itinerary\": {\n" +
        "      \"properties\": {\n" +
        "        \"totalTravelTime\": {\n" +
        "          \"type\": \"string\"\n" +
        "        }\n" +
        "      },\n" +
        "      \"type\": \"object\"\n" +
        "    },\n" +
        "    \"passenger\": {\n" +
        "      \"properties\": {\n" +
        "        \"dateOfBirth\": {\n" +
        "          \"format\": \"date\",\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        \"firstName\": {\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        \"lastName\": {\n" +
        "          \"type\": \"string\"\n" +
        "        }\n" +
        "      },\n" +
        "      \"required\": [\n" +
        "        \"firstName\",\n" +
        "        \"lastName\",\n" +
        "        \"dateOfBirth\"\n" +
        "      ],\n" +
        "      \"type\": \"object\"\n" +
        "    },\n" +
        "    \"payment\": {\n" +
        "      \"properties\": {\n" +
        "        \"creditCardInfo\": {\n" +
        "          \"type\": \"string\"\n" +
        "        },\n" +
        "        \"paymentDate\": {\n" +
        "          \"format\": \"date-time\",\n" +
        "          \"type\": \"string\"\n" +
        "        }\n" +
        "      },\n" +
        "      \"required\": [\n" +
        "        \"creditCardInfo\",\n" +
        "        \"paymentDate\"\n" +
        "      ],\n" +
        "      \"type\": \"object\"\n" +
        "    },\n" +
        "    \"seat\": {\n" +
        "      \"properties\": {\n" +
        "        \"seatNumber\": {\n" +
        "          \"type\": \"string\"\n" +
        "        }\n" +
        "      },\n" +
        "      \"required\": [\n" +
        "        \"seatNumber\"\n" +
        "      ],\n" +
        "      \"type\": \"object\"\n" +
        "    }\n" +
        "  },\n" +
        "  \"required\": [\n" +
        "    \"passenger\",\n" +
        "    \"contact\",\n" +
        "    \"flight\",\n" +
        "    \"seat\",\n" +
        "    \"fare\",\n" +
        "    \"payment\",\n" +
        "    \"itinerary\"\n" +
        "  ],\n" +
        "  \"type\": \"object\"\n" +
        "}",refs = {})
public class PurchaseOrder {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contact")
    private Contact contact;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fare")
    private Fare fare;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flight")
    private Flight flight;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itinerary")
    private Itinerary itinerary;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("passenger")
    private Passenger passenger;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payment")
    private Payment payment;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seat")
    private Seat seat;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contact")
    public Contact getContact() {
        return contact;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("contact")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fare")
    public Fare getFare() {
        return fare;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("fare")
    public void setFare(Fare fare) {
        this.fare = fare;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flight")
    public Flight getFlight() {
        return flight;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flight")
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itinerary")
    public Itinerary getItinerary() {
        return itinerary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itinerary")
    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("passenger")
    public Passenger getPassenger() {
        return passenger;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("passenger")
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payment")
    public Payment getPayment() {
        return payment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("payment")
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seat")
    public Seat getSeat() {
        return seat;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("seat")
    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PurchaseOrder.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("contact");
        sb.append('=');
        sb.append(((this.contact == null)?"<null>":this.contact));
        sb.append(',');
        sb.append("fare");
        sb.append('=');
        sb.append(((this.fare == null)?"<null>":this.fare));
        sb.append(',');
        sb.append("flight");
        sb.append('=');
        sb.append(((this.flight == null)?"<null>":this.flight));
        sb.append(',');
        sb.append("itinerary");
        sb.append('=');
        sb.append(((this.itinerary == null)?"<null>":this.itinerary));
        sb.append(',');
        sb.append("passenger");
        sb.append('=');
        sb.append(((this.passenger == null)?"<null>":this.passenger));
        sb.append(',');
        sb.append("payment");
        sb.append('=');
        sb.append(((this.payment == null)?"<null>":this.payment));
        sb.append(',');
        sb.append("seat");
        sb.append('=');
        sb.append(((this.seat == null)?"<null>":this.seat));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.seat == null)? 0 :this.seat.hashCode()));
        result = ((result* 31)+((this.fare == null)? 0 :this.fare.hashCode()));
        result = ((result* 31)+((this.flight == null)? 0 :this.flight.hashCode()));
        result = ((result* 31)+((this.passenger == null)? 0 :this.passenger.hashCode()));
        result = ((result* 31)+((this.contact == null)? 0 :this.contact.hashCode()));
        result = ((result* 31)+((this.itinerary == null)? 0 :this.itinerary.hashCode()));
        result = ((result* 31)+((this.payment == null)? 0 :this.payment.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PurchaseOrder) == false) {
            return false;
        }
        PurchaseOrder rhs = ((PurchaseOrder) other);
        return (((((((((this.seat == rhs.seat)||((this.seat!= null)&&this.seat.equals(rhs.seat)))&&((this.fare == rhs.fare)||((this.fare!= null)&&this.fare.equals(rhs.fare))))&&((this.flight == rhs.flight)||((this.flight!= null)&&this.flight.equals(rhs.flight))))&&((this.passenger == rhs.passenger)||((this.passenger!= null)&&this.passenger.equals(rhs.passenger))))&&((this.contact == rhs.contact)||((this.contact!= null)&&this.contact.equals(rhs.contact))))&&((this.itinerary == rhs.itinerary)||((this.itinerary!= null)&&this.itinerary.equals(rhs.itinerary))))&&((this.payment == rhs.payment)||((this.payment!= null)&&this.payment.equals(rhs.payment))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
