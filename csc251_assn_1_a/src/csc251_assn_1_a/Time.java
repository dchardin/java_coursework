////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
//  Section:  (your section number)
// 
//  Project:  csc251_assn_1_a
//  File:     Time.java
//  
//  Name:     (your first and last name)
//  Email:    (your Wake Tech Email Address)
////////////////////////////////////////////////////////////////////////////////
package csc251_assn_1_a;

/**
 * (Insert a comment that briefly describes the purpose of this class definition.)
 *
 * <p/> Bugs: (List any known issues or unimplemented features here)
 * 
 * @author (Insert your first and last name)
 *
 */
public class Time
{

	public long hour;
	public long minute;
	public long second;
	
	public Time() {
		
		long allSeconds = System.currentTimeMillis() / 1000;
		long allMinutes = allSeconds / 60;
		long allHours   = allMinutes / 60;
		this.hour = allHours % 24;
		this.minute = allMinutes % 60;
		this.second = allSeconds % 60;
	}
	
	public Time(long hour, long minute, long second) {
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
    public Time(long elapseTime) {
        long allSeconds = elapseTime / 1000;
        long allMinutes = allSeconds / 60;
        long allHours = allMinutes / 60;
        this.hour = allHours % 24;
        this.minute = allMinutes % 60;
        this.second = allSeconds % 60;

    }
    
    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }
    
	
	public static void main(String[] args)
	{
		Time time = new Time(555550000);
		System.out.println(time.hour + ":" + time.minute + ":" + time.second);
	}

}
