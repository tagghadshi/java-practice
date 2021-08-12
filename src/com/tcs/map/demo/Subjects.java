package com.tcs.map.demo;

public class Subjects {
	private float maths;
	private float biology;
	private float physics;

	public Subjects(float maths, float biology, float physics) {
		this.maths = maths;
		this.biology = biology;
		this.physics = physics;
	}

	public float getMaths() {
		return maths;
	}

	public void setMaths(float maths) {
		this.maths = maths;
	}

	public float getBiology() {
		return biology;
	}

	public void setBiology(float biology) {
		this.biology = biology;
	}

	public float getPhysics() {
		return physics;
	}

	public void setPhysics(float physics) {
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "Subjects [maths=" + maths + ", biology=" + biology + ", physics=" + physics + "]";
	}

}
