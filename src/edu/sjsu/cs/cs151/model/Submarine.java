package edu.sjsu.cs.cs151.model;

/**
 * <h1>Submarine class</h1>
 * <p>
 * Submarine is a type of ship that inherited from Ship class
 * 
 * @author Au, Phu, Tri
 * @version 1.0
 * @since 11-29-2018
 */
public class Submarine extends Ship{
	
	/**
	 * This method initalizes and sets the properties of Submarine
	 * @param Nothing
	 * @return Nothing
	 */
	public Submarine()
	{
		super.setLength(3);
		super.setHealth(3);
		super.setShipName("Submarine");
		super.setSunken(false);
	}

	/**
	 * This method prints the string representation of Destroyer
	 * @param Nothing
	 * @return a String of info of Cruiser
	 */
	public String toString()
	{
		return super.toString();
	}
	
	/**
	 * This method gets the name of the ship
	 * @param Nothing
	 * @return ship name
	 */
	public String getShipName()
	{
		return super.getShipName();
	}
	
	/**
	 * This method sets the name of the ship
	 * @param name string to change current name of a ship
	 * @return Nothing
	 */
	public void setShipName(String name)
	{
		super.setShipName(name);
	}
	
	/**
	 * This method gets the length of the ship
	 * @param Nothing
	 * @return integer length
	 */
	public int getLength()
	{
		return super.getLength();
	}
	
	/**
	 * This method sets the length of the ship
	 * @param length value to change current length of a ship
	 * @return Nothing
	 */
	public void setLength(int length)
	{
		super.setLength(length);
	}
	
	/**
	 * This method gets the current health of the ship
	 * @param Nothing
	 * @return shipHealth
	 */
	public int getHealth()
	{
		return super.getHealth();
	}
	
	/**
	 * This method sets the health of the ship
	 * @param Health value to change current health of the a ship
	 * @return Nothing
	 */
	public void setHealth(int Health)
	{
		super.setHealth(Health);
	}
	
	/**
	 * This method sets the current state of the ship
	 * @param update whether the ship is sunken or not
	 * @return Nothing
	 */
	public void setSunken(boolean sunken)
	{
		super.setSunken(sunken);
	}
	
	/**
	 * This method returns the current state of the ship
	 * @param Nothing
	 * @return sunken = True if shipHealth equals 0, otherwise sunken = false
	 */
	public boolean isSunken()
	{
	   return super.isSunken();
	}

}
