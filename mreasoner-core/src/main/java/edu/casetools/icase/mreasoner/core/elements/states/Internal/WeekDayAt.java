package edu.casetools.icase.mreasoner.core.elements.states.Internal;

import java.util.Calendar;

import edu.casetools.icase.mreasoner.core.elements.states.DefaultState;
import edu.casetools.icase.mreasoner.core.elements.time.Time;

public class WeekDayAt extends DefaultState {

	private int weekDay;
	
	public WeekDayAt(){
		name = "WeekDayAt";
		weekDay = 1;
	}
	
	public void setWeekDay(int weekDay){
		this.weekDay = weekDay;
	}
	
	public int getWeekDay(){
		return weekDay;
	}
	
	@Override
	public boolean assertState(Time actualTime) {
		boolean result = false;
		int actualWeekDay = actualTime.getDate(Calendar.DAY_OF_WEEK);
		if(weekDay == actualWeekDay ) result = true;
		if(!this.status) return !result;
		else return result;
	}

	@Override
	public void print() {
		System.out.print(name+"("+weekDay+")");
		
	}

}
