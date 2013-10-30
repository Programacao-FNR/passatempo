package com.adrianoavelar.util;

import java.util.ArrayList;

public enum EstadosBrasil {
	    AC("Acre"),  
	    AL("Alagoas"),  
	    AM("Amazonas"),  
	    AP("Amap�"),  
	    BA("Bahia"),  
	    CE("Cear�"),  
	    DF("Distrito Federal"),  
	    ES("Espirito Santo"),  
	    GO("Goias"),  
	    MA("Maranh�o"),  
	    MG("Minas Gerais"),  
	    MS("Mato Grosso Sul"),  
	    MT("Mato Grosso"),  
	    PA("Par�"),  
	    PB("Paraiba"),  
	    PE("Pernanbuco"),  
	    PI("Piaui"),  
	    PR("Parana"),  
	    RJ("Rio de Janeiro"),  
	    RN("Rio Grande do Norte"),  
	    RO("Rond�nia"),  
	    RR("Roraima"),  
	    RS("Rio Grande do Sul"),  
	    SC("Santa Catarina"),  
	    SE("Sergipe"),  
	    SP("S�o Paulo"),  
	    TO("Tocantins");  
	    
	    private String estado;  
	    private static String[] names = null;
	    
	    public static String[] names() {
	    	
	    	if(names != null)
	    		return names;
	    	
	    	EstadosBrasil[] states = values();
	        names = new String[states.length];

	        for (int i = 0; i < states.length; i++) {
	            names[i] = states[i].name();
	        }

	        return names;
	    }
	    
	    EstadosBrasil(String estado) {  
	        this.estado = estado; 
	    }  
	  
	    public String getEstado() {  
	        return estado;  
	    }  
	  
	    @Override  
	    public String toString() {  
	        return estado;  
	    }  
}