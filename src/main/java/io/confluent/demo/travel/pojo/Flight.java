
package io.confluent.demo.travel.pojo;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "arrivalAirport",
    "departureAirport",
    "departureDateTime",
    "flightNumber"
})
public class Flight {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("arrivalAirport")
    private String arrivalAirport;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureAirport")
    private String departureAirport;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureDateTime")
    private Date departureDateTime;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("arrivalAirport")
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("arrivalAirport")
    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureAirport")
    public String getDepartureAirport() {
        return departureAirport;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureAirport")
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureDateTime")
    public Date getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("departureDateTime")
    public void setDepartureDateTime(Date departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
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
        sb.append(Flight.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("arrivalAirport");
        sb.append('=');
        sb.append(((this.arrivalAirport == null)?"<null>":this.arrivalAirport));
        sb.append(',');
        sb.append("departureAirport");
        sb.append('=');
        sb.append(((this.departureAirport == null)?"<null>":this.departureAirport));
        sb.append(',');
        sb.append("departureDateTime");
        sb.append('=');
        sb.append(((this.departureDateTime == null)?"<null>":this.departureDateTime));
        sb.append(',');
        sb.append("flightNumber");
        sb.append('=');
        sb.append(((this.flightNumber == null)?"<null>":this.flightNumber));
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
        result = ((result* 31)+((this.departureDateTime == null)? 0 :this.departureDateTime.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.departureAirport == null)? 0 :this.departureAirport.hashCode()));
        result = ((result* 31)+((this.arrivalAirport == null)? 0 :this.arrivalAirport.hashCode()));
        result = ((result* 31)+((this.flightNumber == null)? 0 :this.flightNumber.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Flight) == false) {
            return false;
        }
        Flight rhs = ((Flight) other);
        return ((((((this.departureDateTime == rhs.departureDateTime)||((this.departureDateTime!= null)&&this.departureDateTime.equals(rhs.departureDateTime)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.departureAirport == rhs.departureAirport)||((this.departureAirport!= null)&&this.departureAirport.equals(rhs.departureAirport))))&&((this.arrivalAirport == rhs.arrivalAirport)||((this.arrivalAirport!= null)&&this.arrivalAirport.equals(rhs.arrivalAirport))))&&((this.flightNumber == rhs.flightNumber)||((this.flightNumber!= null)&&this.flightNumber.equals(rhs.flightNumber))));
    }

}
