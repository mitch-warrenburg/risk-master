
/**
 * 
 * 
 * Using the Die class provided
 * design and implement classes called PairOfDice and ThreeDice.
 * 
 * 
 * @author code provided by Java Foundations, 3rd edition, 
 * Listing 5.2, page 176.
 * 
 * @version 10/30/2015
 */

public class Die
{
    private int MAX = 6; //max face value
    private int faceValue; // current value showing on the die
    
    /**
     * Contructor: Sets the initial face value of this die.
     */
    
    public Die()
    {
        faceValue = 1;
    }
    
    /**
     * Computes a new face value for this die and returns the result.
     */
    
    public int roll()
    {
        faceValue = (int)(Math.random() * MAX) + 1;
        
        return faceValue;
    }
    
    /**
     * Face value mutator. The face value is not modified if the 
     * specified value is not valid.
     */
    
    public void setFaceValue(int value)
    {
        if (value > 0 && value <= MAX)
            faceValue = value;
    }
    
    /**
     * Face value accessor
     */
     
    public int getFaceValue()
    {
        return faceValue;
    }
    
    /**
     * Returns a string representation of this die.
     */
    
    public String toString()
    {
        String result = Integer.toString(faceValue);
        
        return result;
    }

}// end class