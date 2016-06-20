package MotionlessElements;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class EnergyBall extends MotionlessElements{
	public EnergyBall(){
		LinkedList<IGate> EnergyBall=new LinkedList<IGate>();
	}
	public void notifyObservateurs(){
		Iterator<IGate> it = LinkedList.iterator();
		
		while(it.hasNext()){
			IGate obs = it.next();
			obs.notifier();
		}
	}
	void AO(IGate IGate){
		IGate.add(IGate);
	}
	void SO(IGate IGate){
		IGate.remove(IGate);
	}
	private List IGate;

}
