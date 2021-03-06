package cs310.creativeteamname.shared;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Stores information about a park.
 *
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Park implements Serializable, Comparable {
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private int parkId;    
	@Persistent
	private String name;    
	@Persistent
	private boolean official;    
	@Persistent
	private String streetNumber;    
	@Persistent
	private String streetName;    
	@Persistent
	private String eastWestStreet;
	@Persistent
	private String northSouthStreet;
	@Persistent
	private BigDecimal lat;
	@Persistent
	private BigDecimal lon;
	@Persistent
	private float hectare;
	@Persistent
	private String neighbourhoodName;
	@Persistent
	private String neighbourhoodURL;
	@Persistent
	private String[] facilities;
	@Persistent
	private String[] specialFeatures;
	@Persistent
	private boolean isWashroom;
	@Persistent
	private String imageUrl;

	public Park() {
		facilities = new String[]{};
		specialFeatures = new String[]{};
		isWashroom = false;
	}
    
	public int getParkId() {
		return parkId;
	}
	
	public void setParkId(int parkId) {
		this.parkId = parkId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isOfficial() {
		return official;
	}
	
	public void setOfficial(boolean official) {
		this.official = official;
	}
	
	public String getStreetNumber() {
		return streetNumber;
	}
	
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	
	public String getStreetName() {
		return streetName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public String getEastWestStreet() {
		return eastWestStreet;
	}
	
	public void setEastWestStreet(String eastWestStreet) {
		this.eastWestStreet = eastWestStreet;
	}
	
	public String getNorthSouthStreet() {
		return northSouthStreet;
	}
	
	public void setNorthSouthStreet(String northSouthStreet) {
		this.northSouthStreet = northSouthStreet;
	}
	
	public BigDecimal getLat() {
		return lat;
	}
	
	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}
	
	public BigDecimal getLon() {
		return lon;
	}
	
	public void setLon(BigDecimal lon) {
		this.lon = lon;
	}
	
	public float getHectare() {
		return hectare;
	}
	
	public void setHectare(float hectare) {
		this.hectare = hectare;
	}
	
	public String getNeighbourhoodName() {
		return neighbourhoodName;
	}
	
	public void setNeighbourhoodName(String neighbourhoodName) {
		this.neighbourhoodName = neighbourhoodName;
	}
	
	public String getNeighbourhoodURL() {
		return neighbourhoodURL;
	}
	
	public void setNeighbourhoodURL(String neighbourhoodURL) {
		this.neighbourhoodURL = neighbourhoodURL;
	}
	
	public String[] getFacilities() {
		return facilities;
	}

	public void setFacilities(String[] facilities) {
		this.facilities = facilities;
	}

	public String[] getSpecialFeatures() {
		return specialFeatures;
	}

	public void setSpecialFeatures(String[] specialFeatures) {
		this.specialFeatures = specialFeatures;
	}

	public boolean isWashroom() {
		return isWashroom;
	}

	public void setWashroom(boolean isWashroom) {
		this.isWashroom = isWashroom;
	}

	public String getImageUrl(){
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}
	
	public int compareTo(Object other) {
		Park otherPark = (Park)other;
		return this.parkId - otherPark.getParkId();
	}
	
	public boolean equals(Object other) {
		Park otherPark = (Park)other;
		return (this.parkId == otherPark.getParkId());
	}
	
	public int hashCode() {
		return this.parkId;
	}
}
