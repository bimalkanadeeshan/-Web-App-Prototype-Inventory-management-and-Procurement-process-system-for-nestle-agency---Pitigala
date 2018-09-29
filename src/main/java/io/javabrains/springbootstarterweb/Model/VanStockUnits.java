package io.javabrains.springbootstarterweb.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="van_stock_units")
public class VanStockUnits {
	
	@Id
	private String date;
	private int  NESTOMALT_ACTIGEN;
	private int NESPRAY_EVERYDAY;
	private int MILKMAID_SWT_COND_MILK;
	private int MAGGI_2MINN;
	private int MILO_UHT;
	private int NESTOMALT_RTD;
	private int NESCAFE_ICE;
	private int NESPRAY_RTD;
	private int MAGGI_COCONUT;
	private int MAGGIE_SOUP;
	private int NESCAFE_CLASIIC_JAR;
	private int NESCAFE_GOLD_JAR;
	private int NETEA_SACHET;
	private int NESTLE_CORN_FLAKES;
	private int NESTLE_COCO_CRUNCH;
	private int NESCAFE_ALGERIA;
	private int NESTLE_DOCELLO;
	private int LACTOGEN;
	private int NANGROW;
	private int NESTLE_CERELAC;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getNESTOMALT_ACTIGEN() {
		return NESTOMALT_ACTIGEN;
	}
	public void setNESTOMALT_ACTIGEN(int nESTOMALT_ACTIGEN) {
		NESTOMALT_ACTIGEN = nESTOMALT_ACTIGEN;
	}
	public int getNESPRAY_EVERYDAY() {
		return NESPRAY_EVERYDAY;
	}
	public void setNESPRAY_EVERYDAY(int nESPRAY_EVERYDAY) {
		NESPRAY_EVERYDAY = nESPRAY_EVERYDAY;
	}
	public int getMILKMAID_SWT_COND_MILK() {
		return MILKMAID_SWT_COND_MILK;
	}
	public void setMILKMAID_SWT_COND_MILK(int mILKMAID_SWT_COND_MILK) {
		MILKMAID_SWT_COND_MILK = mILKMAID_SWT_COND_MILK;
	}
	public int getMAGGI_2MINN() {
		return MAGGI_2MINN;
	}
	public void setMAGGI_2MINN(int mAGGI_2MINN) {
		MAGGI_2MINN = mAGGI_2MINN;
	}
	public int getMILO_UHT() {
		return MILO_UHT;
	}
	public void setMILO_UHT(int mILO_UHT) {
		MILO_UHT = mILO_UHT;
	}
	public int getNESTOMALT_RTD() {
		return NESTOMALT_RTD;
	}
	public void setNESTOMALT_RTD(int nESTOMALT_RTD) {
		NESTOMALT_RTD = nESTOMALT_RTD;
	}
	public int getNESCAFE_ICE() {
		return NESCAFE_ICE;
	}
	public void setNESCAFE_ICE(int nESCAFE_ICE) {
		NESCAFE_ICE = nESCAFE_ICE;
	}
	public int getNESPRAY_RTD() {
		return NESPRAY_RTD;
	}
	public void setNESPRAY_RTD(int nESPRAY_RTD) {
		NESPRAY_RTD = nESPRAY_RTD;
	}
	public int getMAGGI_COCONUT() {
		return MAGGI_COCONUT;
	}
	public void setMAGGI_COCONUT(int mAGGI_COCONUT) {
		MAGGI_COCONUT = mAGGI_COCONUT;
	}
	public int getMAGGIE_SOUP() {
		return MAGGIE_SOUP;
	}
	public void setMAGGIE_SOUP(int mAGGIE_SOUP) {
		MAGGIE_SOUP = mAGGIE_SOUP;
	}
	public int getNESCAFE_CLASIIC_JAR() {
		return NESCAFE_CLASIIC_JAR;
	}
	public void setNESCAFE_CLASIIC_JAR(int nESCAFE_CLASIIC_JAR) {
		NESCAFE_CLASIIC_JAR = nESCAFE_CLASIIC_JAR;
	}
	public int getNESCAFE_GOLD_JAR() {
		return NESCAFE_GOLD_JAR;
	}
	public void setNESCAFE_GOLD_JAR(int nESCAFE_GOLD_JAR) {
		NESCAFE_GOLD_JAR = nESCAFE_GOLD_JAR;
	}
	public int getNETEA_SACHET() {
		return NETEA_SACHET;
	}
	public void setNETEA_SACHET(int nETEA_SACHET) {
		NETEA_SACHET = nETEA_SACHET;
	}
	public int getNESTLE_CORN_FLAKES() {
		return NESTLE_CORN_FLAKES;
	}
	public void setNESTLE_CORN_FLAKES(int nESTLE_CORN_FLAKES) {
		NESTLE_CORN_FLAKES = nESTLE_CORN_FLAKES;
	}
	public int getNESTLE_COCO_CRUNCH() {
		return NESTLE_COCO_CRUNCH;
	}
	public void setNESTLE_COCO_CRUNCH(int nESTLE_COCO_CRUNCH) {
		NESTLE_COCO_CRUNCH = nESTLE_COCO_CRUNCH;
	}
	public int getNESCAFE_ALGERIA() {
		return NESCAFE_ALGERIA;
	}
	public void setNESCAFE_ALGERIA(int nESCAFE_ALGERIA) {
		NESCAFE_ALGERIA = nESCAFE_ALGERIA;
	}
	public int getNESTLE_DOCELLO() {
		return NESTLE_DOCELLO;
	}
	public void setNESTLE_DOCELLO(int nESTLE_DOCELLO) {
		NESTLE_DOCELLO = nESTLE_DOCELLO;
	}
	public int getLACTOGEN() {
		return LACTOGEN;
	}
	public void setLACTOGEN(int lACTOGEN) {
		LACTOGEN = lACTOGEN;
	}
	public int getNANGROW() {
		return NANGROW;
	}
	public void setNANGROW(int nANGROW) {
		NANGROW = nANGROW;
	}
	public int getNESTLE_CERELAC() {
		return NESTLE_CERELAC;
	}
	public void setNESTLE_CERELAC(int nESTLE_CERELAC) {
		NESTLE_CERELAC = nESTLE_CERELAC;
	}
	
	public VanStockUnits(String date, int nESTOMALT_ACTIGEN, int nESPRAY_EVERYDAY, int mILKMAID_SWT_COND_MILK,
			int mAGGI_2MINN, int mILO_UHT, int nESTOMALT_RTD, int nESCAFE_ICE, int nESPRAY_RTD, int mAGGI_COCONUT,
			int mAGGIE_SOUP, int nESCAFE_CLASIIC_JAR, int nESCAFE_GOLD_JAR, int nETEA_SACHET, int nESTLE_CORN_FLAKES,
			int nESTLE_COCO_CRUNCH, int nESCAFE_ALGERIA, int nESTLE_DOCELLO, int lACTOGEN, int nANGROW,
			int nESTLE_CERELAC) {
		super();
		this.date = date;
		NESTOMALT_ACTIGEN = nESTOMALT_ACTIGEN;
		NESPRAY_EVERYDAY = nESPRAY_EVERYDAY;
		MILKMAID_SWT_COND_MILK = mILKMAID_SWT_COND_MILK;
		MAGGI_2MINN = mAGGI_2MINN;
		MILO_UHT = mILO_UHT;
		NESTOMALT_RTD = nESTOMALT_RTD;
		NESCAFE_ICE = nESCAFE_ICE;
		NESPRAY_RTD = nESPRAY_RTD;
		MAGGI_COCONUT = mAGGI_COCONUT;
		MAGGIE_SOUP = mAGGIE_SOUP;
		NESCAFE_CLASIIC_JAR = nESCAFE_CLASIIC_JAR;
		NESCAFE_GOLD_JAR = nESCAFE_GOLD_JAR;
		NETEA_SACHET = nETEA_SACHET;
		NESTLE_CORN_FLAKES = nESTLE_CORN_FLAKES;
		NESTLE_COCO_CRUNCH = nESTLE_COCO_CRUNCH;
		NESCAFE_ALGERIA = nESCAFE_ALGERIA;
		NESTLE_DOCELLO = nESTLE_DOCELLO;
		LACTOGEN = lACTOGEN;
		NANGROW = nANGROW;
		NESTLE_CERELAC = nESTLE_CERELAC;
	}
	
	@Override
	public String toString() {
		return "VanStockUnits [date=" + date + ", NESTOMALT_ACTIGEN=" + NESTOMALT_ACTIGEN + ", NESPRAY_EVERYDAY="
				+ NESPRAY_EVERYDAY + ", MILKMAID_SWT_COND_MILK=" + MILKMAID_SWT_COND_MILK + ", MAGGI_2MINN="
				+ MAGGI_2MINN + ", MILO_UHT=" + MILO_UHT + ", NESTOMALT_RTD=" + NESTOMALT_RTD + ", NESCAFE_ICE="
				+ NESCAFE_ICE + ", NESPRAY_RTD=" + NESPRAY_RTD + ", MAGGI_COCONUT=" + MAGGI_COCONUT + ", MAGGIE_SOUP="
				+ MAGGIE_SOUP + ", NESCAFE_CLASIIC_JAR=" + NESCAFE_CLASIIC_JAR + ", NESCAFE_GOLD_JAR="
				+ NESCAFE_GOLD_JAR + ", NETEA_SACHET=" + NETEA_SACHET + ", NESTLE_CORN_FLAKES=" + NESTLE_CORN_FLAKES
				+ ", NESTLE_COCO_CRUNCH=" + NESTLE_COCO_CRUNCH + ", NESCAFE_ALGERIA=" + NESCAFE_ALGERIA
				+ ", NESTLE_DOCELLO=" + NESTLE_DOCELLO + ", LACTOGEN=" + LACTOGEN + ", NANGROW=" + NANGROW
				+ ", NESTLE_CERELAC=" + NESTLE_CERELAC + "]";
	}
	
	

}
