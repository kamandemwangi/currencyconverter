package com.kamandemwangi.Currency.Rates.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURRENCIES_RATES")
public class RateEntity {

    @Id
    @SerializedName("AED")
    @Expose
    private Double AED;
    @SerializedName("AFN")
    @Expose
    private Double AFN;
    @SerializedName("ALL")
    @Expose
    private Double LEK;
    @SerializedName("AMD")
    @Expose
    private Double AMD;
    @SerializedName("ANG")
    @Expose
    private Double ANG;
    @SerializedName("AOA")
    @Expose
    private Double AOA;
    @SerializedName("ARS")
    @Expose
    private Double ARS;
    @SerializedName("AUD")
    @Expose
    private Double AUD;
    @SerializedName("AWG")
    @Expose
    private Double AWG;
    @SerializedName("AZN")
    @Expose
    private Double AZN;
    @SerializedName("BAM")
    @Expose
    private Double BAM;
    @SerializedName("BBD")
    @Expose
    private Double BBD;
    @SerializedName("BDT")
    @Expose
    private Double BDT;
    @SerializedName("BGN")
    @Expose
    private Double BGN;
    @SerializedName("BHD")
    @Expose
    private Double BHD;
    @SerializedName("BIF")
    @Expose
    private Double BIF;
    @SerializedName("BMD")
    @Expose
    private Double BMD;
    @SerializedName("BND")
    @Expose
    private Double BND;
    @SerializedName("BOB")
    @Expose
    private Double BOB;
    @SerializedName("BRL")
    @Expose
    private Double BRL;
    @SerializedName("BSD")
    @Expose
    private Double BSD;
    @SerializedName("BTC")
    @Expose
    private Double BTC;
    @SerializedName("BTN")
    @Expose
    private Double BTN;
    @SerializedName("BWP")
    @Expose
    private Double BWP;
    @SerializedName("BYN")
    @Expose
    private Double BYN;
    @SerializedName("BYR")
    @Expose
    private Double BYR;
    @SerializedName("BZD")
    @Expose
    private Double BZD;
    @SerializedName("CAD")
    @Expose
    private Double CAD;
    @SerializedName("CDF")
    @Expose
    private Double CDF;
    @SerializedName("CHF")
    @Expose
    private Double CHF;
    @SerializedName("CLF")
    @Expose
    private Double CLF;
    @SerializedName("CLP")
    @Expose
    private Double CLP;
    @SerializedName("CNY")
    @Expose
    private Double CNY;
    @SerializedName("COP")
    @Expose
    private Double COP;
    @SerializedName("CRC")
    @Expose
    private Double CRC;
    @SerializedName("CUC")
    @Expose
    private Double CUC;
    @SerializedName("CUP")
    @Expose
    private Double CUP;
    @SerializedName("CVE")
    @Expose
    private Double CVE;
    @SerializedName("CZK")
    @Expose
    private Double CZK;
    @SerializedName("DJF")
    @Expose
    private Double DJF;
    @SerializedName("DKK")
    @Expose
    private Double DKK;
    @SerializedName("DOP")
    @Expose
    private Double DOP;
    @SerializedName("DZD")
    @Expose
    private Double DZD;
    @SerializedName("EGP")
    @Expose
    private Double EGP;
    @SerializedName("ERN")
    @Expose
    private Double ERN;
    @SerializedName("ETB")
    @Expose
    private Double ETB;
    @SerializedName("EUR")
    @Expose
    private Double EUR;
    @SerializedName("FJD")
    @Expose
    private Double FJD;
    @SerializedName("FKP")
    @Expose
    private Double FKP;
    @SerializedName("GBP")
    @Expose
    private Double GBP;
    @SerializedName("GEL")
    @Expose
    private Double GEL;
    @SerializedName("GGP")
    @Expose
    private Double GGP;
    @SerializedName("GHS")
    @Expose
    private Double GHS;
    @SerializedName("GIP")
    @Expose
    private Double GIP;
    @SerializedName("GMD")
    @Expose
    private Double GMD;
    @SerializedName("GNF")
    @Expose
    private Double GNF;
    @SerializedName("GTQ")
    @Expose
    private Double GTQ;
    @SerializedName("GYD")
    @Expose
    private Double GYD;
    @SerializedName("HKD")
    @Expose
    private Double HKD;
    @SerializedName("HNL")
    @Expose
    private Double HNL;
    @SerializedName("HRK")
    @Expose
    private Double HRK;
    @SerializedName("HTG")
    @Expose
    private Double HTG;
    @SerializedName("HUF")
    @Expose
    private Double HUF;
    @SerializedName("IDR")
    @Expose
    private Double IDR;
    @SerializedName("ILS")
    @Expose
    private Double ILS;
    @SerializedName("IMP")
    @Expose
    private Double IMP;
    @SerializedName("INR")
    @Expose
    private Double INR;
    @SerializedName("IQD")
    @Expose
    private Double IQD;
    @SerializedName("IRR")
    @Expose
    private Double IRR;
    @SerializedName("ISK")
    @Expose
    private Double ISK;
    @SerializedName("JEP")
    @Expose
    private Double JEP;
    @SerializedName("JMD")
    @Expose
    private Double JMD;
    @SerializedName("JOD")
    @Expose
    private Double JOD;
    @SerializedName("JPY")
    @Expose
    private Double JPY;
    @SerializedName("KES")
    @Expose
    private Double KES;
    @SerializedName("KGS")
    @Expose
    private Double KGS;
    @SerializedName("KHR")
    @Expose
    private Double KHR;
    @SerializedName("KMF")
    @Expose
    private Double KMF;
    @SerializedName("KPW")
    @Expose
    private Double KPW;
    @SerializedName("KRW")
    @Expose
    private Double KRW;
    @SerializedName("KWD")
    @Expose
    private Double KWD;
    @SerializedName("KYD")
    @Expose
    private Double KYD;
    @SerializedName("KZT")
    @Expose
    private Double KZT;
    @SerializedName("LAK")
    @Expose
    private Double LAK;
    @SerializedName("LBP")
    @Expose
    private Double LBP;
    @SerializedName("LKR")
    @Expose
    private Double LKR;
    @SerializedName("LRD")
    @Expose
    private Double LRD;
    @SerializedName("LSL")
    @Expose
    private Double LSL;
    @SerializedName("LTL")
    @Expose
    private Double LTL;
    @SerializedName("LVL")
    @Expose
    private Double LVL;
    @SerializedName("LYD")
    @Expose
    private Double LYD;
    @SerializedName("MAD")
    @Expose
    private Double MAD;
    @SerializedName("MDL")
    @Expose
    private Double MDL;
    @SerializedName("MGA")
    @Expose
    private Double MGA;
    @SerializedName("MKD")
    @Expose
    private Double MKD;
    @SerializedName("MMK")
    @Expose
    private Double MMK;
    @SerializedName("MNT")
    @Expose
    private Double MNT;
    @SerializedName("MOP")
    @Expose
    private Double MOP;
    @SerializedName("MRO")
    @Expose
    private Double MRO;
    @SerializedName("MUR")
    @Expose
    private Double MUR;
    @SerializedName("MVR")
    @Expose
    private Double MVR;
    @SerializedName("MWK")
    @Expose
    private Double MWK;
    @SerializedName("MXN")
    @Expose
    private Double MXN;
    @SerializedName("MYR")
    @Expose
    private Double MYR;
    @SerializedName("MZN")
    @Expose
    private Double MZN;
    @SerializedName("NAD")
    @Expose
    private Double NAD;
    @SerializedName("NGN")
    @Expose
    private Double NGN;
    @SerializedName("NIO")
    @Expose
    private Double NIO;
    @SerializedName("NOK")
    @Expose
    private Double NOK;
    @SerializedName("NPR")
    @Expose
    private Double NPR;
    @SerializedName("NZD")
    @Expose
    private Double NZD;
    @SerializedName("OMR")
    @Expose
    private Double OMR;
    @SerializedName("PAB")
    @Expose
    private Double PAB;
    @SerializedName("PEN")
    @Expose
    private Double PEN;
    @SerializedName("PGK")
    @Expose
    private Double PGK;
    @SerializedName("PHP")
    @Expose
    private Double PHP;
    @SerializedName("PKR")
    @Expose
    private Double PKR;
    @SerializedName("PLN")
    @Expose
    private Double PLN;
    @SerializedName("PYG")
    @Expose
    private Double PYG;
    @SerializedName("QAR")
    @Expose
    private Double QAR;
    @SerializedName("RON")
    @Expose
    private Double RON;
    @SerializedName("RSD")
    @Expose
    private Double RSD;
    @SerializedName("RUB")
    @Expose
    private Double RUB;
    @SerializedName("RWF")
    @Expose
    private Double RWF;
    @SerializedName("SAR")
    @Expose
    private Double SAR;
    @SerializedName("SBD")
    @Expose
    private Double SBD;
    @SerializedName("SCR")
    @Expose
    private Double SCR;
    @SerializedName("SDG")
    @Expose
    private Double SDG;
    @SerializedName("SEK")
    @Expose
    private Double SEK;
    @SerializedName("SGD")
    @Expose
    private Double SGD;
    @SerializedName("SHP")
    @Expose
    private Double SHP;
    @SerializedName("SLE")
    @Expose
    private Double SLE;
    @SerializedName("SLL")
    @Expose
    private Double SLL;
    @SerializedName("SOS")
    @Expose
    private Double SOS;
    @SerializedName("SRD")
    @Expose
    private Double SRD;
    @SerializedName("STD")
    @Expose
    private Double STD;
    @SerializedName("SVC")
    @Expose
    private Double SVC;
    @SerializedName("SYP")
    @Expose
    private Double SYP;
    @SerializedName("SZL")
    @Expose
    private Double SZL;
    @SerializedName("THB")
    @Expose
    private Double THB;
    @SerializedName("TJS")
    @Expose
    private Double TJS;
    @SerializedName("TMT")
    @Expose
    private Double TMT;
    @SerializedName("TND")
    @Expose
    private Double TND;
    @SerializedName("TOP")
    @Expose
    private Double TOP;
    @SerializedName("TRY")
    @Expose
    private Double TRY;
    @SerializedName("TTD")
    @Expose
    private Double TTD;
    @SerializedName("TWD")
    @Expose
    private Double TWD;
    @SerializedName("TZS")
    @Expose
    private Double TZS;
    @SerializedName("UAH")
    @Expose
    private Double UAH;
    @SerializedName("UGX")
    @Expose
    private Double UGX;
    @SerializedName("USD")
    @Expose
    private Double USD;
    @SerializedName("UYU")
    @Expose
    private Double UYU;
    @SerializedName("UZS")
    @Expose
    private Double UZS;
    @SerializedName("VEF")
    @Expose
    private Double VEF;
    @SerializedName("VES")
    @Expose
    private Double VES;
    @SerializedName("VND")
    @Expose
    private Double VND;
    @SerializedName("VUV")
    @Expose
    private Double VUV;
    @SerializedName("WST")
    @Expose
    private Double WST;
    @SerializedName("XAF")
    @Expose
    private Double XAF;
    @SerializedName("XAG")
    @Expose
    private Double XAG;
    @SerializedName("XAU")
    @Expose
    private Double XAU;
    @SerializedName("XCD")
    @Expose
    private Double XCD;
    @SerializedName("XDR")
    @Expose
    private Double XDR;
    @SerializedName("XOF")
    @Expose
    private Double XOF;
    @SerializedName("XPF")
    @Expose
    private Double XPF;
    @SerializedName("YER")
    @Expose
    private Double YER;
    @SerializedName("ZAR")
    @Expose
    private Double ZAR;
    @SerializedName("ZMK")
    @Expose
    private Double ZMK;
    @SerializedName("ZMW")
    @Expose
    private Double ZMW;
    @SerializedName("ZWL")
    @Expose
    private Double ZWL;

    public RateEntity() {
    }

    public RateEntity(Double AED, Double AFN, Double ALL, Double AMD, Double ANG, Double AOA, Double ARS, Double AUD, Double AWG, Double AZN, Double BAM, Double BBD, Double BDT, Double BGN, Double BHD, Double BIF, Double BMD, Double BND, Double BOB, Double BRL, Double BSD, Double BTC, Double BTN, Double BWP, Double BYN, Double BYR, Double BZD, Double CAD, Double CDF, Double CHF, Double CLF, Double CLP, Double CNY, Double COP, Double CRC, Double CUC, Double CUP, Double CVE, Double CZK, Double DJF, Double DKK, Double DOP, Double DZD, Double EGP, Double ERN, Double ETB, Double EUR, Double FJD, Double FKP, Double GBP, Double GEL, Double GGP, Double GHS, Double GIP, Double GMD, Double GNF, Double GTQ, Double GYD, Double HKD, Double HNL, Double HRK, Double HTG, Double HUF, Double IDR, Double ILS, Double IMP, Double INR, Double IQD, Double IRR, Double ISK, Double JEP, Double JMD, Double JOD, Double JPY, Double KES, Double KGS, Double KHR, Double KMF, Double KPW, Double KRW, Double KWD, Double KYD, Double KZT, Double LAK, Double LBP, Double LKR, Double LRD, Double LSL, Double LTL, Double LVL, Double LYD, Double MAD, Double MDL, Double MGA, Double MKD, Double MMK, Double MNT, Double MOP, Double MRO, Double MUR, Double MVR, Double MWK, Double MXN, Double MYR, Double MZN, Double NAD, Double NGN, Double NIO, Double NOK, Double NPR, Double NZD, Double OMR, Double PAB, Double PEN, Double PGK, Double PHP, Double PKR, Double PLN, Double PYG, Double QAR, Double RON, Double RSD, Double RUB, Double RWF, Double SAR, Double SBD, Double SCR, Double SDG, Double SEK, Double SGD, Double SHP, Double SLE, Double SLL, Double SOS, Double SRD, Double STD, Double SVC, Double SYP, Double SZL, Double THB, Double TJS, Double TMT, Double TND, Double TOP, Double TRY, Double TTD, Double TWD, Double TZS, Double UAH, Double UGX, Double USD, Double UYU, Double UZS, Double VEF, Double VES, Double VND, Double VUV, Double WST, Double XAF, Double XAG, Double XAU, Double XCD, Double XDR, Double XOF, Double XPF, Double YER, Double ZAR, Double ZMK, Double ZMW, Double ZWL) {
        this.AED = AED;
        this.AFN = AFN;
        this.LEK = ALL;
        this.AMD = AMD;
        this.ANG = ANG;
        this.AOA = AOA;
        this.ARS = ARS;
        this.AUD = AUD;
        this.AWG = AWG;
        this.AZN = AZN;
        this.BAM = BAM;
        this.BBD = BBD;
        this.BDT = BDT;
        this.BGN = BGN;
        this.BHD = BHD;
        this.BIF = BIF;
        this.BMD = BMD;
        this.BND = BND;
        this.BOB = BOB;
        this.BRL = BRL;
        this.BSD = BSD;
        this.BTC = BTC;
        this.BTN = BTN;
        this.BWP = BWP;
        this.BYN = BYN;
        this.BYR = BYR;
        this.BZD = BZD;
        this.CAD = CAD;
        this.CDF = CDF;
        this.CHF = CHF;
        this.CLF = CLF;
        this.CLP = CLP;
        this.CNY = CNY;
        this.COP = COP;
        this.CRC = CRC;
        this.CUC = CUC;
        this.CUP = CUP;
        this.CVE = CVE;
        this.CZK = CZK;
        this.DJF = DJF;
        this.DKK = DKK;
        this.DOP = DOP;
        this.DZD = DZD;
        this.EGP = EGP;
        this.ERN = ERN;
        this.ETB = ETB;
        this.EUR = EUR;
        this.FJD = FJD;
        this.FKP = FKP;
        this.GBP = GBP;
        this.GEL = GEL;
        this.GGP = GGP;
        this.GHS = GHS;
        this.GIP = GIP;
        this.GMD = GMD;
        this.GNF = GNF;
        this.GTQ = GTQ;
        this.GYD = GYD;
        this.HKD = HKD;
        this.HNL = HNL;
        this.HRK = HRK;
        this.HTG = HTG;
        this.HUF = HUF;
        this.IDR = IDR;
        this.ILS = ILS;
        this.IMP = IMP;
        this.INR = INR;
        this.IQD = IQD;
        this.IRR = IRR;
        this.ISK = ISK;
        this.JEP = JEP;
        this.JMD = JMD;
        this.JOD = JOD;
        this.JPY = JPY;
        this.KES = KES;
        this.KGS = KGS;
        this.KHR = KHR;
        this.KMF = KMF;
        this.KPW = KPW;
        this.KRW = KRW;
        this.KWD = KWD;
        this.KYD = KYD;
        this.KZT = KZT;
        this.LAK = LAK;
        this.LBP = LBP;
        this.LKR = LKR;
        this.LRD = LRD;
        this.LSL = LSL;
        this.LTL = LTL;
        this.LVL = LVL;
        this.LYD = LYD;
        this.MAD = MAD;
        this.MDL = MDL;
        this.MGA = MGA;
        this.MKD = MKD;
        this.MMK = MMK;
        this.MNT = MNT;
        this.MOP = MOP;
        this.MRO = MRO;
        this.MUR = MUR;
        this.MVR = MVR;
        this.MWK = MWK;
        this.MXN = MXN;
        this.MYR = MYR;
        this.MZN = MZN;
        this.NAD = NAD;
        this.NGN = NGN;
        this.NIO = NIO;
        this.NOK = NOK;
        this.NPR = NPR;
        this.NZD = NZD;
        this.OMR = OMR;
        this.PAB = PAB;
        this.PEN = PEN;
        this.PGK = PGK;
        this.PHP = PHP;
        this.PKR = PKR;
        this.PLN = PLN;
        this.PYG = PYG;
        this.QAR = QAR;
        this.RON = RON;
        this.RSD = RSD;
        this.RUB = RUB;
        this.RWF = RWF;
        this.SAR = SAR;
        this.SBD = SBD;
        this.SCR = SCR;
        this.SDG = SDG;
        this.SEK = SEK;
        this.SGD = SGD;
        this.SHP = SHP;
        this.SLE = SLE;
        this.SLL = SLL;
        this.SOS = SOS;
        this.SRD = SRD;
        this.STD = STD;
        this.SVC = SVC;
        this.SYP = SYP;
        this.SZL = SZL;
        this.THB = THB;
        this.TJS = TJS;
        this.TMT = TMT;
        this.TND = TND;
        this.TOP = TOP;
        this.TRY = TRY;
        this.TTD = TTD;
        this.TWD = TWD;
        this.TZS = TZS;
        this.UAH = UAH;
        this.UGX = UGX;
        this.USD = USD;
        this.UYU = UYU;
        this.UZS = UZS;
        this.VEF = VEF;
        this.VES = VES;
        this.VND = VND;
        this.VUV = VUV;
        this.WST = WST;
        this.XAF = XAF;
        this.XAG = XAG;
        this.XAU = XAU;
        this.XCD = XCD;
        this.XDR = XDR;
        this.XOF = XOF;
        this.XPF = XPF;
        this.YER = YER;
        this.ZAR = ZAR;
        this.ZMK = ZMK;
        this.ZMW = ZMW;
        this.ZWL = ZWL;
    }
    public Double getAED() {
        return AED;
    }

    public void setAED(Double AED) {
        this.AED = AED;
    }

    public Double getAFN() {
        return AFN;
    }

    public void setAFN(Double AFN) {
        this.AFN = AFN;
    }

    public Double getLEK() {
        return LEK;
    }

    public void setLEK(Double LEK) {
        this.LEK = LEK;
    }

    public Double getAMD() {
        return AMD;
    }

    public void setAMD(Double AMD) {
        this.AMD = AMD;
    }

    public Double getANG() {
        return ANG;
    }

    public void setANG(Double ANG) {
        this.ANG = ANG;
    }

    public Double getAOA() {
        return AOA;
    }

    public void setAOA(Double AOA) {
        this.AOA = AOA;
    }

    public Double getARS() {
        return ARS;
    }

    public void setARS(Double ARS) {
        this.ARS = ARS;
    }

    public Double getAUD() {
        return AUD;
    }

    public void setAUD(Double AUD) {
        this.AUD = AUD;
    }

    public Double getAWG() {
        return AWG;
    }

    public void setAWG(Double AWG) {
        this.AWG = AWG;
    }

    public Double getAZN() {
        return AZN;
    }

    public void setAZN(Double AZN) {
        this.AZN = AZN;
    }

    public Double getBAM() {
        return BAM;
    }

    public void setBAM(Double BAM) {
        this.BAM = BAM;
    }

    public Double getBBD() {
        return BBD;
    }

    public void setBBD(Double BBD) {
        this.BBD = BBD;
    }

    public Double getBDT() {
        return BDT;
    }

    public void setBDT(Double BDT) {
        this.BDT = BDT;
    }

    public Double getBGN() {
        return BGN;
    }

    public void setBGN(Double BGN) {
        this.BGN = BGN;
    }

    public Double getBHD() {
        return BHD;
    }

    public void setBHD(Double BHD) {
        this.BHD = BHD;
    }

    public Double getBIF() {
        return BIF;
    }

    public void setBIF(Double BIF) {
        this.BIF = BIF;
    }

    public Double getBMD() {
        return BMD;
    }

    public void setBMD(Double BMD) {
        this.BMD = BMD;
    }

    public Double getBND() {
        return BND;
    }

    public void setBND(Double BND) {
        this.BND = BND;
    }

    public Double getBOB() {
        return BOB;
    }

    public void setBOB(Double BOB) {
        this.BOB = BOB;
    }

    public Double getBRL() {
        return BRL;
    }

    public void setBRL(Double BRL) {
        this.BRL = BRL;
    }

    public Double getBSD() {
        return BSD;
    }

    public void setBSD(Double BSD) {
        this.BSD = BSD;
    }

    public Double getBTC() {
        return BTC;
    }

    public void setBTC(Double BTC) {
        this.BTC = BTC;
    }

    public Double getBTN() {
        return BTN;
    }

    public void setBTN(Double BTN) {
        this.BTN = BTN;
    }

    public Double getBWP() {
        return BWP;
    }

    public void setBWP(Double BWP) {
        this.BWP = BWP;
    }

    public Double getBYN() {
        return BYN;
    }

    public void setBYN(Double BYN) {
        this.BYN = BYN;
    }

    public Double getBYR() {
        return BYR;
    }

    public void setBYR(Double BYR) {
        this.BYR = BYR;
    }

    public Double getBZD() {
        return BZD;
    }

    public void setBZD(Double BZD) {
        this.BZD = BZD;
    }

    public Double getCAD() {
        return CAD;
    }

    public void setCAD(Double CAD) {
        this.CAD = CAD;
    }

    public Double getCDF() {
        return CDF;
    }

    public void setCDF(Double CDF) {
        this.CDF = CDF;
    }

    public Double getCHF() {
        return CHF;
    }

    public void setCHF(Double CHF) {
        this.CHF = CHF;
    }

    public Double getCLF() {
        return CLF;
    }

    public void setCLF(Double CLF) {
        this.CLF = CLF;
    }

    public Double getCLP() {
        return CLP;
    }

    public void setCLP(Double CLP) {
        this.CLP = CLP;
    }

    public Double getCNY() {
        return CNY;
    }

    public void setCNY(Double CNY) {
        this.CNY = CNY;
    }

    public Double getCOP() {
        return COP;
    }

    public void setCOP(Double COP) {
        this.COP = COP;
    }

    public Double getCRC() {
        return CRC;
    }

    public void setCRC(Double CRC) {
        this.CRC = CRC;
    }

    public Double getCUC() {
        return CUC;
    }

    public void setCUC(Double CUC) {
        this.CUC = CUC;
    }

    public Double getCUP() {
        return CUP;
    }

    public void setCUP(Double CUP) {
        this.CUP = CUP;
    }

    public Double getCVE() {
        return CVE;
    }

    public void setCVE(Double CVE) {
        this.CVE = CVE;
    }

    public Double getCZK() {
        return CZK;
    }

    public void setCZK(Double CZK) {
        this.CZK = CZK;
    }

    public Double getDJF() {
        return DJF;
    }

    public void setDJF(Double DJF) {
        this.DJF = DJF;
    }

    public Double getDKK() {
        return DKK;
    }

    public void setDKK(Double DKK) {
        this.DKK = DKK;
    }

    public Double getDOP() {
        return DOP;
    }

    public void setDOP(Double DOP) {
        this.DOP = DOP;
    }

    public Double getDZD() {
        return DZD;
    }

    public void setDZD(Double DZD) {
        this.DZD = DZD;
    }

    public Double getEGP() {
        return EGP;
    }

    public void setEGP(Double EGP) {
        this.EGP = EGP;
    }

    public Double getERN() {
        return ERN;
    }

    public void setERN(Double ERN) {
        this.ERN = ERN;
    }

    public Double getETB() {
        return ETB;
    }

    public void setETB(Double ETB) {
        this.ETB = ETB;
    }

    public Double getEUR() {
        return EUR;
    }

    public void setEUR(Double EUR) {
        this.EUR = EUR;
    }

    public Double getFJD() {
        return FJD;
    }

    public void setFJD(Double FJD) {
        this.FJD = FJD;
    }

    public Double getFKP() {
        return FKP;
    }

    public void setFKP(Double FKP) {
        this.FKP = FKP;
    }

    public Double getGBP() {
        return GBP;
    }

    public void setGBP(Double GBP) {
        this.GBP = GBP;
    }

    public Double getGEL() {
        return GEL;
    }

    public void setGEL(Double GEL) {
        this.GEL = GEL;
    }

    public Double getGGP() {
        return GGP;
    }

    public void setGGP(Double GGP) {
        this.GGP = GGP;
    }

    public Double getGHS() {
        return GHS;
    }

    public void setGHS(Double GHS) {
        this.GHS = GHS;
    }

    public Double getGIP() {
        return GIP;
    }

    public void setGIP(Double GIP) {
        this.GIP = GIP;
    }

    public Double getGMD() {
        return GMD;
    }

    public void setGMD(Double GMD) {
        this.GMD = GMD;
    }

    public Double getGNF() {
        return GNF;
    }

    public void setGNF(Double GNF) {
        this.GNF = GNF;
    }

    public Double getGTQ() {
        return GTQ;
    }

    public void setGTQ(Double GTQ) {
        this.GTQ = GTQ;
    }

    public Double getGYD() {
        return GYD;
    }

    public void setGYD(Double GYD) {
        this.GYD = GYD;
    }

    public Double getHKD() {
        return HKD;
    }

    public void setHKD(Double HKD) {
        this.HKD = HKD;
    }

    public Double getHNL() {
        return HNL;
    }

    public void setHNL(Double HNL) {
        this.HNL = HNL;
    }

    public Double getHRK() {
        return HRK;
    }

    public void setHRK(Double HRK) {
        this.HRK = HRK;
    }

    public Double getHTG() {
        return HTG;
    }

    public void setHTG(Double HTG) {
        this.HTG = HTG;
    }

    public Double getHUF() {
        return HUF;
    }

    public void setHUF(Double HUF) {
        this.HUF = HUF;
    }

    public Double getIDR() {
        return IDR;
    }

    public void setIDR(Double IDR) {
        this.IDR = IDR;
    }

    public Double getILS() {
        return ILS;
    }

    public void setILS(Double ILS) {
        this.ILS = ILS;
    }

    public Double getIMP() {
        return IMP;
    }

    public void setIMP(Double IMP) {
        this.IMP = IMP;
    }

    public Double getINR() {
        return INR;
    }

    public void setINR(Double INR) {
        this.INR = INR;
    }

    public Double getIQD() {
        return IQD;
    }

    public void setIQD(Double IQD) {
        this.IQD = IQD;
    }

    public Double getIRR() {
        return IRR;
    }

    public void setIRR(Double IRR) {
        this.IRR = IRR;
    }

    public Double getISK() {
        return ISK;
    }

    public void setISK(Double ISK) {
        this.ISK = ISK;
    }

    public Double getJEP() {
        return JEP;
    }

    public void setJEP(Double JEP) {
        this.JEP = JEP;
    }

    public Double getJMD() {
        return JMD;
    }

    public void setJMD(Double JMD) {
        this.JMD = JMD;
    }

    public Double getJOD() {
        return JOD;
    }

    public void setJOD(Double JOD) {
        this.JOD = JOD;
    }

    public Double getJPY() {
        return JPY;
    }

    public void setJPY(Double JPY) {
        this.JPY = JPY;
    }

    public Double getKES() {
        return KES;
    }

    public void setKES(Double KES) {
        this.KES = KES;
    }

    public Double getKGS() {
        return KGS;
    }

    public void setKGS(Double KGS) {
        this.KGS = KGS;
    }

    public Double getKHR() {
        return KHR;
    }

    public void setKHR(Double KHR) {
        this.KHR = KHR;
    }

    public Double getKMF() {
        return KMF;
    }

    public void setKMF(Double KMF) {
        this.KMF = KMF;
    }

    public Double getKPW() {
        return KPW;
    }

    public void setKPW(Double KPW) {
        this.KPW = KPW;
    }

    public Double getKRW() {
        return KRW;
    }

    public void setKRW(Double KRW) {
        this.KRW = KRW;
    }

    public Double getKWD() {
        return KWD;
    }

    public void setKWD(Double KWD) {
        this.KWD = KWD;
    }

    public Double getKYD() {
        return KYD;
    }

    public void setKYD(Double KYD) {
        this.KYD = KYD;
    }

    public Double getKZT() {
        return KZT;
    }

    public void setKZT(Double KZT) {
        this.KZT = KZT;
    }

    public Double getLAK() {
        return LAK;
    }

    public void setLAK(Double LAK) {
        this.LAK = LAK;
    }

    public Double getLBP() {
        return LBP;
    }

    public void setLBP(Double LBP) {
        this.LBP = LBP;
    }

    public Double getLKR() {
        return LKR;
    }

    public void setLKR(Double LKR) {
        this.LKR = LKR;
    }

    public Double getLRD() {
        return LRD;
    }

    public void setLRD(Double LRD) {
        this.LRD = LRD;
    }

    public Double getLSL() {
        return LSL;
    }

    public void setLSL(Double LSL) {
        this.LSL = LSL;
    }

    public Double getLTL() {
        return LTL;
    }

    public void setLTL(Double LTL) {
        this.LTL = LTL;
    }

    public Double getLVL() {
        return LVL;
    }

    public void setLVL(Double LVL) {
        this.LVL = LVL;
    }

    public Double getLYD() {
        return LYD;
    }

    public void setLYD(Double LYD) {
        this.LYD = LYD;
    }

    public Double getMAD() {
        return MAD;
    }

    public void setMAD(Double MAD) {
        this.MAD = MAD;
    }

    public Double getMDL() {
        return MDL;
    }

    public void setMDL(Double MDL) {
        this.MDL = MDL;
    }

    public Double getMGA() {
        return MGA;
    }

    public void setMGA(Double MGA) {
        this.MGA = MGA;
    }

    public Double getMKD() {
        return MKD;
    }

    public void setMKD(Double MKD) {
        this.MKD = MKD;
    }

    public Double getMMK() {
        return MMK;
    }

    public void setMMK(Double MMK) {
        this.MMK = MMK;
    }

    public Double getMNT() {
        return MNT;
    }

    public void setMNT(Double MNT) {
        this.MNT = MNT;
    }

    public Double getMOP() {
        return MOP;
    }

    public void setMOP(Double MOP) {
        this.MOP = MOP;
    }

    public Double getMRO() {
        return MRO;
    }

    public void setMRO(Double MRO) {
        this.MRO = MRO;
    }

    public Double getMUR() {
        return MUR;
    }

    public void setMUR(Double MUR) {
        this.MUR = MUR;
    }

    public Double getMVR() {
        return MVR;
    }

    public void setMVR(Double MVR) {
        this.MVR = MVR;
    }

    public Double getMWK() {
        return MWK;
    }

    public void setMWK(Double MWK) {
        this.MWK = MWK;
    }

    public Double getMXN() {
        return MXN;
    }

    public void setMXN(Double MXN) {
        this.MXN = MXN;
    }

    public Double getMYR() {
        return MYR;
    }

    public void setMYR(Double MYR) {
        this.MYR = MYR;
    }

    public Double getMZN() {
        return MZN;
    }

    public void setMZN(Double MZN) {
        this.MZN = MZN;
    }

    public Double getNAD() {
        return NAD;
    }

    public void setNAD(Double NAD) {
        this.NAD = NAD;
    }

    public Double getNGN() {
        return NGN;
    }

    public void setNGN(Double NGN) {
        this.NGN = NGN;
    }

    public Double getNIO() {
        return NIO;
    }

    public void setNIO(Double NIO) {
        this.NIO = NIO;
    }

    public Double getNOK() {
        return NOK;
    }

    public void setNOK(Double NOK) {
        this.NOK = NOK;
    }

    public Double getNPR() {
        return NPR;
    }

    public void setNPR(Double NPR) {
        this.NPR = NPR;
    }

    public Double getNZD() {
        return NZD;
    }

    public void setNZD(Double NZD) {
        this.NZD = NZD;
    }

    public Double getOMR() {
        return OMR;
    }

    public void setOMR(Double OMR) {
        this.OMR = OMR;
    }

    public Double getPAB() {
        return PAB;
    }

    public void setPAB(Double PAB) {
        this.PAB = PAB;
    }

    public Double getPEN() {
        return PEN;
    }

    public void setPEN(Double PEN) {
        this.PEN = PEN;
    }

    public Double getPGK() {
        return PGK;
    }

    public void setPGK(Double PGK) {
        this.PGK = PGK;
    }

    public Double getPHP() {
        return PHP;
    }

    public void setPHP(Double PHP) {
        this.PHP = PHP;
    }

    public Double getPKR() {
        return PKR;
    }

    public void setPKR(Double PKR) {
        this.PKR = PKR;
    }

    public Double getPLN() {
        return PLN;
    }

    public void setPLN(Double PLN) {
        this.PLN = PLN;
    }

    public Double getPYG() {
        return PYG;
    }

    public void setPYG(Double PYG) {
        this.PYG = PYG;
    }

    public Double getQAR() {
        return QAR;
    }

    public void setQAR(Double QAR) {
        this.QAR = QAR;
    }

    public Double getRON() {
        return RON;
    }

    public void setRON(Double RON) {
        this.RON = RON;
    }

    public Double getRSD() {
        return RSD;
    }

    public void setRSD(Double RSD) {
        this.RSD = RSD;
    }

    public Double getRUB() {
        return RUB;
    }

    public void setRUB(Double RUB) {
        this.RUB = RUB;
    }

    public Double getRWF() {
        return RWF;
    }

    public void setRWF(Double RWF) {
        this.RWF = RWF;
    }

    public Double getSAR() {
        return SAR;
    }

    public void setSAR(Double SAR) {
        this.SAR = SAR;
    }

    public Double getSBD() {
        return SBD;
    }

    public void setSBD(Double SBD) {
        this.SBD = SBD;
    }

    public Double getSCR() {
        return SCR;
    }

    public void setSCR(Double SCR) {
        this.SCR = SCR;
    }

    public Double getSDG() {
        return SDG;
    }

    public void setSDG(Double SDG) {
        this.SDG = SDG;
    }

    public Double getSEK() {
        return SEK;
    }

    public void setSEK(Double SEK) {
        this.SEK = SEK;
    }

    public Double getSGD() {
        return SGD;
    }

    public void setSGD(Double SGD) {
        this.SGD = SGD;
    }

    public Double getSHP() {
        return SHP;
    }

    public void setSHP(Double SHP) {
        this.SHP = SHP;
    }

    public Double getSLE() {
        return SLE;
    }

    public void setSLE(Double SLE) {
        this.SLE = SLE;
    }

    public Double getSLL() {
        return SLL;
    }

    public void setSLL(Double SLL) {
        this.SLL = SLL;
    }

    public Double getSOS() {
        return SOS;
    }

    public void setSOS(Double SOS) {
        this.SOS = SOS;
    }

    public Double getSRD() {
        return SRD;
    }

    public void setSRD(Double SRD) {
        this.SRD = SRD;
    }

    public Double getSTD() {
        return STD;
    }

    public void setSTD(Double STD) {
        this.STD = STD;
    }

    public Double getSVC() {
        return SVC;
    }

    public void setSVC(Double SVC) {
        this.SVC = SVC;
    }

    public Double getSYP() {
        return SYP;
    }

    public void setSYP(Double SYP) {
        this.SYP = SYP;
    }

    public Double getSZL() {
        return SZL;
    }

    public void setSZL(Double SZL) {
        this.SZL = SZL;
    }

    public Double getTHB() {
        return THB;
    }

    public void setTHB(Double THB) {
        this.THB = THB;
    }

    public Double getTJS() {
        return TJS;
    }

    public void setTJS(Double TJS) {
        this.TJS = TJS;
    }

    public Double getTMT() {
        return TMT;
    }

    public void setTMT(Double TMT) {
        this.TMT = TMT;
    }

    public Double getTND() {
        return TND;
    }

    public void setTND(Double TND) {
        this.TND = TND;
    }

    public Double getTOP() {
        return TOP;
    }

    public void setTOP(Double TOP) {
        this.TOP = TOP;
    }

    public Double getTRY() {
        return TRY;
    }

    public void setTRY(Double TRY) {
        this.TRY = TRY;
    }

    public Double getTTD() {
        return TTD;
    }

    public void setTTD(Double TTD) {
        this.TTD = TTD;
    }

    public Double getTWD() {
        return TWD;
    }

    public void setTWD(Double TWD) {
        this.TWD = TWD;
    }

    public Double getTZS() {
        return TZS;
    }

    public void setTZS(Double TZS) {
        this.TZS = TZS;
    }

    public Double getUAH() {
        return UAH;
    }

    public void setUAH(Double UAH) {
        this.UAH = UAH;
    }

    public Double getUGX() {
        return UGX;
    }

    public void setUGX(Double UGX) {
        this.UGX = UGX;
    }

    public Double getUSD() {
        return USD;
    }

    public void setUSD(Double USD) {
        this.USD = USD;
    }

    public Double getUYU() {
        return UYU;
    }

    public void setUYU(Double UYU) {
        this.UYU = UYU;
    }

    public Double getUZS() {
        return UZS;
    }

    public void setUZS(Double UZS) {
        this.UZS = UZS;
    }

    public Double getVEF() {
        return VEF;
    }

    public void setVEF(Double VEF) {
        this.VEF = VEF;
    }

    public Double getVES() {
        return VES;
    }

    public void setVES(Double VES) {
        this.VES = VES;
    }

    public Double getVND() {
        return VND;
    }

    public void setVND(Double VND) {
        this.VND = VND;
    }

    public Double getVUV() {
        return VUV;
    }

    public void setVUV(Double VUV) {
        this.VUV = VUV;
    }

    public Double getWST() {
        return WST;
    }

    public void setWST(Double WST) {
        this.WST = WST;
    }

    public Double getXAF() {
        return XAF;
    }

    public void setXAF(Double XAF) {
        this.XAF = XAF;
    }

    public Double getXAG() {
        return XAG;
    }

    public void setXAG(Double XAG) {
        this.XAG = XAG;
    }

    public Double getXAU() {
        return XAU;
    }

    public void setXAU(Double XAU) {
        this.XAU = XAU;
    }

    public Double getXCD() {
        return XCD;
    }

    public void setXCD(Double XCD) {
        this.XCD = XCD;
    }

    public Double getXDR() {
        return XDR;
    }

    public void setXDR(Double XDR) {
        this.XDR = XDR;
    }

    public Double getXOF() {
        return XOF;
    }

    public void setXOF(Double XOF) {
        this.XOF = XOF;
    }

    public Double getXPF() {
        return XPF;
    }

    public void setXPF(Double XPF) {
        this.XPF = XPF;
    }

    public Double getYER() {
        return YER;
    }

    public void setYER(Double YER) {
        this.YER = YER;
    }

    public Double getZAR() {
        return ZAR;
    }

    public void setZAR(Double ZAR) {
        this.ZAR = ZAR;
    }

    public Double getZMK() {
        return ZMK;
    }

    public void setZMK(Double ZMK) {
        this.ZMK = ZMK;
    }

    public Double getZMW() {
        return ZMW;
    }

    public void setZMW(Double ZMW) {
        this.ZMW = ZMW;
    }

    public Double getZWL() {
        return ZWL;
    }

    public void setZWL(Double ZWL) {
        this.ZWL = ZWL;
    }

    @Override
    public String toString() {
        return "RateEntity{" +
                ", AED=" + AED +
                ", AFN=" + AFN +
                ", ALL=" + LEK +
                ", AMD=" + AMD +
                ", ANG=" + ANG +
                ", AOA=" + AOA +
                ", ARS=" + ARS +
                ", AUD=" + AUD +
                ", AWG=" + AWG +
                ", AZN=" + AZN +
                ", BAM=" + BAM +
                ", BBD=" + BBD +
                ", BDT=" + BDT +
                ", BGN=" + BGN +
                ", BHD=" + BHD +
                ", BIF=" + BIF +
                ", BMD=" + BMD +
                ", BND=" + BND +
                ", BOB=" + BOB +
                ", BRL=" + BRL +
                ", BSD=" + BSD +
                ", BTC=" + BTC +
                ", BTN=" + BTN +
                ", BWP=" + BWP +
                ", BYN=" + BYN +
                ", BYR=" + BYR +
                ", BZD=" + BZD +
                ", CAD=" + CAD +
                ", CDF=" + CDF +
                ", CHF=" + CHF +
                ", CLF=" + CLF +
                ", CLP=" + CLP +
                ", CNY=" + CNY +
                ", COP=" + COP +
                ", CRC=" + CRC +
                ", CUC=" + CUC +
                ", CUP=" + CUP +
                ", CVE=" + CVE +
                ", CZK=" + CZK +
                ", DJF=" + DJF +
                ", DKK=" + DKK +
                ", DOP=" + DOP +
                ", DZD=" + DZD +
                ", EGP=" + EGP +
                ", ERN=" + ERN +
                ", ETB=" + ETB +
                ", EUR=" + EUR +
                ", FJD=" + FJD +
                ", FKP=" + FKP +
                ", GBP=" + GBP +
                ", GEL=" + GEL +
                ", GGP=" + GGP +
                ", GHS=" + GHS +
                ", GIP=" + GIP +
                ", GMD=" + GMD +
                ", GNF=" + GNF +
                ", GTQ=" + GTQ +
                ", GYD=" + GYD +
                ", HKD=" + HKD +
                ", HNL=" + HNL +
                ", HRK=" + HRK +
                ", HTG=" + HTG +
                ", HUF=" + HUF +
                ", IDR=" + IDR +
                ", ILS=" + ILS +
                ", IMP=" + IMP +
                ", INR=" + INR +
                ", IQD=" + IQD +
                ", IRR=" + IRR +
                ", ISK=" + ISK +
                ", JEP=" + JEP +
                ", JMD=" + JMD +
                ", JOD=" + JOD +
                ", JPY=" + JPY +
                ", KES=" + KES +
                ", KGS=" + KGS +
                ", KHR=" + KHR +
                ", KMF=" + KMF +
                ", KPW=" + KPW +
                ", KRW=" + KRW +
                ", KWD=" + KWD +
                ", KYD=" + KYD +
                ", KZT=" + KZT +
                ", LAK=" + LAK +
                ", LBP=" + LBP +
                ", LKR=" + LKR +
                ", LRD=" + LRD +
                ", LSL=" + LSL +
                ", LTL=" + LTL +
                ", LVL=" + LVL +
                ", LYD=" + LYD +
                ", MAD=" + MAD +
                ", MDL=" + MDL +
                ", MGA=" + MGA +
                ", MKD=" + MKD +
                ", MMK=" + MMK +
                ", MNT=" + MNT +
                ", MOP=" + MOP +
                ", MRO=" + MRO +
                ", MUR=" + MUR +
                ", MVR=" + MVR +
                ", MWK=" + MWK +
                ", MXN=" + MXN +
                ", MYR=" + MYR +
                ", MZN=" + MZN +
                ", NAD=" + NAD +
                ", NGN=" + NGN +
                ", NIO=" + NIO +
                ", NOK=" + NOK +
                ", NPR=" + NPR +
                ", NZD=" + NZD +
                ", OMR=" + OMR +
                ", PAB=" + PAB +
                ", PEN=" + PEN +
                ", PGK=" + PGK +
                ", PHP=" + PHP +
                ", PKR=" + PKR +
                ", PLN=" + PLN +
                ", PYG=" + PYG +
                ", QAR=" + QAR +
                ", RON=" + RON +
                ", RSD=" + RSD +
                ", RUB=" + RUB +
                ", RWF=" + RWF +
                ", SAR=" + SAR +
                ", SBD=" + SBD +
                ", SCR=" + SCR +
                ", SDG=" + SDG +
                ", SEK=" + SEK +
                ", SGD=" + SGD +
                ", SHP=" + SHP +
                ", SLE=" + SLE +
                ", SLL=" + SLL +
                ", SOS=" + SOS +
                ", SRD=" + SRD +
                ", STD=" + STD +
                ", SVC=" + SVC +
                ", SYP=" + SYP +
                ", SZL=" + SZL +
                ", THB=" + THB +
                ", TJS=" + TJS +
                ", TMT=" + TMT +
                ", TND=" + TND +
                ", TOP=" + TOP +
                ", TRY=" + TRY +
                ", TTD=" + TTD +
                ", TWD=" + TWD +
                ", TZS=" + TZS +
                ", UAH=" + UAH +
                ", UGX=" + UGX +
                ", USD=" + USD +
                ", UYU=" + UYU +
                ", UZS=" + UZS +
                ", VEF=" + VEF +
                ", VES=" + VES +
                ", VND=" + VND +
                ", VUV=" + VUV +
                ", WST=" + WST +
                ", XAF=" + XAF +
                ", XAG=" + XAG +
                ", XAU=" + XAU +
                ", XCD=" + XCD +
                ", XDR=" + XDR +
                ", XOF=" + XOF +
                ", XPF=" + XPF +
                ", YER=" + YER +
                ", ZAR=" + ZAR +
                ", ZMK=" + ZMK +
                ", ZMW=" + ZMW +
                ", ZWL=" + ZWL +
                '}';
    }
}