package io.confluent.demo.travel.producer;

import com.github.javafaker.Faker;
import io.confluent.demo.travel.pojo.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PurchaseOrderDataGen {

    public static PurchaseOrder getNewPurchaseOrder() {
        Faker fake = new Faker();

        Contact contact = new Contact();
        contact.setEmail(fake.internet().emailAddress());
        contact.setMailingAddress(fake.address().fullAddress());
        contact.setPhoneNumber(fake.phoneNumber().cellPhone());

        Fare fare = new Fare();
        fare.setTicketPrice(new Double(fake.commerce().price()).doubleValue());

        Flight flight = new Flight();
        flight.setFlightNumber(fake.aviation().aircraft());
        flight.setArrivalAirport(fake.aviation().airport());
        flight.setDepartureAirport(fake.aviation().airport());
        flight.setDepartureDateTime(new Date());

        Itinerary itinerary = new Itinerary();
        itinerary.setTotalTravelTime("" + fake.number().numberBetween(1, 10));

        Passenger passenger = new Passenger();
        passenger.setDateOfBirth(fake.date().birthday().toString());
        passenger.setFirstName(fake.name().firstName());
        passenger.setLastName(fake.name().lastName());

        Payment payment = new Payment();
        payment.setPaymentDate(fake.date().future(5, TimeUnit.DAYS));
        payment.setCreditCardInfo(fake.finance().creditCard());

        Seat seat = new Seat();
        seat.setSeatNumber(fake.number().numberBetween(1, 100) + "");

        PurchaseOrder purchaseOrder = new PurchaseOrder();
        purchaseOrder.setContact(contact);
        purchaseOrder.setFare(fare);
        purchaseOrder.setFlight(flight);
        purchaseOrder.setItinerary(itinerary);
        purchaseOrder.setPassenger(passenger);
        purchaseOrder.setPayment(payment);
        purchaseOrder.setSeat(seat);

        return purchaseOrder;
    }
}
