package CounterStriker.models.field;

import CounterStriker.models.players.CounterTerrorist;
import CounterStriker.models.players.Player;
import CounterStriker.models.players.Terrorist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FieldImpl implements Field {

//    Player mainCharacter = this.players.remove("Tommy Vercetti");
//        int tommyKills = 0;
//        boolean noAction = true;
//        for (Gun gun : mainCharacter.getGunRepository().getModels()) {
//            while (gun.canFire()){
//                noAction = false;
//                int fire = gun.fire();
//                List<Player> playerList = new ArrayList<>(this.players.values());
//                if (!playerList.isEmpty()){
//                    Player damaged = playerList.get(0);
//                    damaged.takeLifePoints(fire);
//                    if (!damaged.isAlive()){
//                        this.players.remove(damaged.getName());
//                        tommyKills++;
//                    }
//
//                }
//            }
//        }
//
//        for (Player value : players.values()) {
//            for (Gun gun : value.getGunRepository().getModels()) {
//                while (gun.canFire()){
//                    noAction = false;
//                    int fire = gun.fire();
//                    mainCharacter.takeLifePoints(fire);
//                    if (!mainCharacter.isAlive()){
//                        break;
//                    }
//                }
//            }
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
                if (!counterTerrorists.isEmpty()){

                }
            }
        }

        return null;
    }
}
