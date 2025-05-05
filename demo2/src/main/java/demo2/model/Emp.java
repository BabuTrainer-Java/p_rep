package demo2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Emp {
@Id
@GeneratedValue
int eid;
@Override
public String toString() {
	return "Emp [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
String ename;
double esal;
}
