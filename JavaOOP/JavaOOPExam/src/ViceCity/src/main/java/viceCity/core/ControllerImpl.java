package viceCity.core;

import static viceCity.common.ConstantMessages.*;
import viceCity.core.interfaces.Controller;
import viceCity.models.guns.Gun;
import viceCity.models.guns.Pistol;
import viceCity.models.guns.Rifle;
import viceCity.models.players.CivilPlayer;
import viceCity.models.players.MainPlayer;
import viceCity.models.players.Player;

import java.util.*;

public class ControllerImpl implements Controller {

    private Map<String,Player> players;
    private Deque<Gun> guns;

    public ControllerImpl(){
        Player mainPl = new MainPlayer();
        this.players = new HashMap<>();
        this.players.put(mainPl.getName(),mainPl);
        this.guns = new ArrayDeque<>();
    }
    @Override
    public String addPlayer(String name) {
        Player player = new CivilPlayer(name);
        this.players.put(name,player);
        return String.format(PLAYER_ADDED,name);
    }

    @Override
    public String addGun(String type, String name) {
        Gun gun = null;
        switch (type){
            case "Pistol":
                gun = new Pistol(name);
                break;
            case "Rifle":
                gun = new Rifle(name);
                break;
            default:
                return GUN_TYPE_INVALID;
        }
        this.guns.offer(gun);
        return String.format(GUN_ADDED,name,type);
    }

    @Override
    public String addGunToPlayer(String name) {
        if (guns.isEmpty()){
            return GUN_QUEUE_IS_EMPTY;
        }

        Gun first = null;
        if (name.equals("Vercetti")){
            first = this.guns.poll();
            this.players.get("Tommy Vercetti").getGunRepository().add(first);
            return String.format(GUN_ADDED_TO_MAIN_PLAYER,first.getName(),"Tommy Vercetti");
        }

        if (!this.players.containsKey(name)){
            return CIVIL_PLAYER_DOES_NOT_EXIST;
        }
        first = this.guns.poll();
        this.players.get(name).getGunRepository().add(first);

        return String.format(GUN_ADDED_TO_CIVIL_PLAYER,first.getName(),name);
    }

    @Override
    public String fight() {
        Player mainCharacter = this.players.remove("Tommy Vercetti");
        int tommyKills = 0;
        boolean noAction = true;
        for (Gun gun : mainCharacter.getGunRepository().getModels()) {
            while (gun.canFire()){
                noAction = false;
                int fire = gun.fire();
                List<Player> playerList = new ArrayList<>(this.players.values());
                if (!playerList.isEmpty()){
                    Player damaged = playerList.get(0);
                    damaged.takeLifePoints(fire);
                    if (!damaged.isAlive()){
                        this.players.remove(damaged.getName());
                        tommyKills++;
                    }

                }
            }
        }

        for (Player value : players.values()) {
            for (Gun gun : value.getGunRepository().getModels()) {
                while (gun.canFire()){
                    noAction = false;
                    int fire = gun.fire();
                    mainCharacter.takeLifePoints(fire);
                    if (!mainCharacter.isAlive()){
                        break;
                    }
                }
            }
        }


        if (noAction){
            this.players.putIfAbsent(mainCharacter.getName(),mainCharacter);
            return FIGHT_HOT_HAPPENED;
        }else {
            StringBuilder sb = new StringBuilder();
            sb.append(FIGHT_HAPPENED).append(System.lineSeparator());
            sb.append(String.format(MAIN_PLAYER_LIVE_POINTS_MESSAGE,mainCharacter.getLifePoints()));
            sb.append(System.lineSeparator());
            sb.append(String.format(MAIN_PLAYER_KILLED_CIVIL_PLAYERS_MESSAGE,tommyKills));
            sb.append(System.lineSeparator());
            sb.append(String.format(CIVIL_PLAYERS_LEFT_MESSAGE,this.players.size()));
            return sb.toString();

        }
    }

}
