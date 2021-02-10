package com.infotech;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NashornJavaScriptEngineClient56 {

    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine engine = scriptEngineManager.getEngineByName("Nashorn");
        try {
            engine.eval("print('Hello World!')");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            engine.eval(new FileReader("src\\demo.js"));
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            engine.eval(new FileReader("src/demoFunc.js"));
            Invocable invocable = (Invocable) engine;
            Object result = invocable.invokeFunction("func", "Mahdiye Nikraftar");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
