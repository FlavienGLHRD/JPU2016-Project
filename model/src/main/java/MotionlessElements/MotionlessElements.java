package MotionlessElements;

	public abstract class MotionlessElements {
		
		public static final MotionlessElements BONESH = new BonesH();
		public static final MotionlessElements BONESV = new BonesV();
		public static final MotionlessElements ENERGYBALL = new EnergyBall();
		public static final MotionlessElements GATE = new Gate();
		public static final MotionlessElements PURSE = new Purse();
		public static final MotionlessElements BONESBALL = new BonesBalls();

		private static MotionlessElements MotionlessElements[]	= { BONESH, BONESV, ENERGYBALL, GATE, PURSE, BONESBALL };
		
	}


