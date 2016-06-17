package MotionlessElements;

import Elements.Permeability;
import Elements.Sprite;

public abstract class MotionlessElements {
		
		public MotionlessElements(Sprite sprite, Permeability penetrable, char c) {
			// TODO Auto-generated constructor stub
		}

		public static MotionlessElements getBonesh() {
			return BONESH;
		}

		private static final MotionlessElements BONESH = new BonesH();
		public static final MotionlessElements BONESV = new BonesV();
		public static final MotionlessElements ENERGYBALL = new EnergyBall();
		public static final MotionlessElements GATE = new Gate();
		public static final MotionlessElements PURSE = new Purse();
		public static final MotionlessElements BONESBALL = new BonesBalls();

		private static MotionlessElements MotionlessElements[]	= { getBonesh(), BONESV, ENERGYBALL, GATE, PURSE, BONESBALL };
		
	}


