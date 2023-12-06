package service;

import corbaConversion.IconversionRemotePOA;

public class ConversionImpl extends IconversionRemotePOA {

    @Override
    public double convertirMontnant(double mt) {
        return mt*3.3;
    }
}
