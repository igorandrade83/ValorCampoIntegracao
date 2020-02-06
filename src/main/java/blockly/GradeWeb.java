package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class GradeWeb {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Grade
public static Var Antes() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(Var.valueOf(Var.valueOf("Antes: ").toString() + cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.grid94799")).toString()).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var Depois() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(Var.valueOf(Var.valueOf("Depois: ").toString() + cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.grid94799")).toString()).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

