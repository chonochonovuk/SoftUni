package CounterStriker.models.field;

import CounterStriker.common.OutputMessages;
import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class FieldImpl implements Field {


    @Override
    public String start(Collection<Player> players) {
        List<Terrorist> terrorists = new ArrayList<>();
        List<CounterTerrorist> counterTerrorists = new ArrayList<>();
        for (Player player : players) {
            if (player instanceof Terrorist){
                terrorists.add((Terrorist) player);
            }
            if (player instanceof CounterTerrorist){
                counterTerrorists.add((CounterTerrorist) player);
            }
        }
        for (Terrorist terrorist : terrorists) {
            while (terrorist.getGun().getBulletsCount() > 0){
                int fire = terrorist.getGun().fire();
                if (!counterTerrorists.isEmpty()){
                    CounterTerrorist damaged = counterTerrorists.get(0);
                    damaged.takeDamage(fire);
                    if (!damaged.isAlive()){
                        counterTerrorists.remove(damaged);
                    }
                }
            }
        }

       if (!counterTerrorists.isEmpty()){
           for (CounterTerrorist counterTerrorist : counterTerrorists) {
               while (counterTerrorist.getGun().getBulletsCount() > 0){
                   int fires = counterTerrorist.getGun().fire();
                   if (!terrorists.isEmpty()){
                       Terrorist terrorist = terrorists.get(0);
                       terrorist.takeDamage(fires);
                       if (!terrorist.isAlive()){
                           terrorists.remove(terrorist);
                       }
                   }
               }
           }
       }

       String result = (terrorists.size() > counterTerrorists.size()) ? OutputMessages.TERRORIST_WINS : OutputMessages.COUNTER_TERRORIST_WINS;


        return result;
    }
}
