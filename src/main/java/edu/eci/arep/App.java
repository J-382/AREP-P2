package edu.eci.arep;

import static spark.Spark.*;

public class App {

    public static void main(String[] args) {

        port(getPort());
        
        get("/cos", ((req, res) -> {
            res.type("application/json");
            Double input = Double.parseDouble(req.queryParams("value"));
            return MathServices.Asin(input);
        }));

        get("/sqrt", ((req, res) -> {
            res.type("application/json");
            Double input = Double.parseDouble(req.queryParams("value"));
            return MathServices.Sqrt(input);
        }));
    } 

    public static int getPort(){
        if (System.getenv("PORT") != null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
} 
