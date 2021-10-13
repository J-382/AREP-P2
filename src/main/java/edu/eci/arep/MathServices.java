package edu.eci.arep;

import org.json.JSONObject;

public class MathServices {
    
    private static JSONObject makeJson(String operation, Double input, Double output){
        JSONObject json = new JSONObject();
        json.put("operation", operation);
        json.put("input", input);
        json.put("output", output);
        return json;
    }

    public static JSONObject Asin(Double input){
        return makeJson("asin", input, Math.asin(input));
    }

    public static JSONObject Sqrt(Double input){
        return makeJson("sqrt", input, Math.sqrt(input));
    }
}
