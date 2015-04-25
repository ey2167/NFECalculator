/**
 * 
 * Elohe Yonas
 * CSC201
 *
 */
public class FeCalculator {
protected int strength;	
protected  int skill;
protected int speed; 
protected int luck;
protected int defense;
protected int resistance;
protected int motion;
protected int atk;
protected int def;
protected int hit;
protected int avoid;
protected int crit;
protected int critavoid;
protected int res;

FeCalculator(){


	
}

public int getStrength() {
	return strength;
}
public void setStrength(int strength) {
	this.strength = strength;
}
public int getSkill() {
	
	return skill;
}
public void setSkill(int skill) {
	this.skill = skill;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getLuck() {
	return luck;
}
public void setLuck(int luck) {
	this.luck = luck;
}
public int getDefense() {
	return defense;
}
public void setDefense(int defense) {
	this.defense = defense;
}
public int getResistance() {
	return resistance;
}
public void setResistance(int resistance) {
	this.resistance = resistance;
}
public int getMotion() {
	return motion;
}
public void setMotion(int motion) {
	this.motion = motion;
}
public int getAtk() {
	atk = strength;
	return atk;
}
public void setAtk(int atk) {
	this.atk = atk;
}
public int getDef() {
	def = defense + motion/3;
	return def;
}
public void setDef(int def) {
	this.def = def;
}
public int getHit() {
	hit = skill + luck;
	return hit;
}
public void setHit(int hit) {
	this.hit = hit;
}
public int getAvoid() {
	avoid = luck + motion + 3*speed;
	return avoid;
}
public void setAvoid(int avoid) {
	this.avoid = avoid;
}
public int getCrit() {
	crit = (skill/2);
	return crit;
}
public void setCrit(int crit) {
	this.crit = crit;
}
public int getCritavoid() {
	critavoid = luck;
	return critavoid;
}
public void setCritavoid(int critavoid) {
	this.critavoid = critavoid;
}
public int getRes() {
	res = resistance;
	return res;
}
public void setRes(int res) {
	this.res = res;
}

}

