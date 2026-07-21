package opcode;

public class Command {

    public static final class Client {
        public static final Client CL_APPEARANCE = new Client();
        public static final Client CL_BANK_CLOSE = new Client();
        public static final Client CL_BANK_DEPOSIT = new Client();
        public static final Client CL_BANK_WITHDRAW = new Client();
        public static final Client CL_CAST_GROUND = new Client();
        public static final Client CL_CAST_GROUNDITEM = new Client();
        public static final Client CL_CAST_INVITEM = new Client();
        public static final Client CL_CAST_NPC = new Client();
        public static final Client CL_CAST_OBJECT = new Client();
        public static final Client CL_CAST_PLAYER = new Client();
        public static final Client CL_CAST_SELF = new Client();
        public static final Client CL_CAST_WALLOBJECT = new Client();
        public static final Client CL_CHAT = new Client();
        public static final Client CL_CHOOSE_OPTION = new Client();
        public static final Client CL_CLOSE_CONNECTION = new Client();
        public static final Client CL_COMBAT_STYLE = new Client();
        public static final Client CL_COMMAND = new Client();
        public static final Client CL_DUEL_ACCEPT = new Client();
        public static final Client CL_DUEL_CONFIRM_ACCEPT = new Client();
        public static final Client CL_DUEL_DECLINE = new Client();
        public static final Client CL_DUEL_ITEM_UPDATE = new Client();
        public static final Client CL_DUEL_SETTINGS = new Client();
        public static final Client CL_FRIEND_ADD = new Client();
        public static final Client CL_FRIEND_REMOVE = new Client();
        public static final Client CL_GROUNDITEM_TAKE = new Client();
        public static final Client CL_IGNORE_ADD = new Client();
        public static final Client CL_IGNORE_REMOVE = new Client();
        public static final Client CL_INV_CMD = new Client();
        public static final Client CL_INV_DROP = new Client();
        public static final Client CL_INV_UNEQUIP = new Client();
        public static final Client CL_INV_WEAR = new Client();
        public static final Client CL_KNOWN_PLAYERS = new Client();
        public static final Client CL_LOGIN = new Client();
        public static final Client CL_LOGOUT = new Client();
        public static final Client CL_NPC_ATTACK = new Client();
        public static final Client CL_NPC_CMD = new Client();
        public static final Client CL_NPC_TALK = new Client();
        public static final Client CL_OBJECT_CMD1 = new Client();
        public static final Client CL_OBJECT_CMD2 = new Client();
        public static final Client CL_PACKET_EXCEPTION = new Client();
        public static final Client CL_PING = new Client();
        public static final Client CL_PLAYER_ATTACK = new Client();
        public static final Client CL_PLAYER_DUEL = new Client();
        public static final Client CL_PLAYER_FOLLOW = new Client();
        public static final Client CL_PLAYER_TRADE = new Client();
        public static final Client CL_PM = new Client();
        public static final Client CL_PRAYER_OFF = new Client();
        public static final Client CL_PRAYER_ON = new Client();
        public static final Client CL_REPORT_ABUSE = new Client();
        public static final Client CL_SESSION = new Client();
        public static final Client CL_SETTINGS_GAME = new Client();
        public static final Client CL_SETTINGS_PRIVACY = new Client();
        public static final Client CL_SHOP_BUY = new Client();
        public static final Client CL_SHOP_CLOSE = new Client();
        public static final Client CL_SHOP_SELL = new Client();
        public static final Client CL_SLEEP_WORD = new Client();
        public static final Client CL_TRADE_ACCEPT = new Client();
        public static final Client CL_TRADE_CONFIRM_ACCEPT = new Client();
        public static final Client CL_TRADE_DECLINE = new Client();
        public static final Client CL_TRADE_ITEM_UPDATE = new Client();
        public static final Client CL_USEWITH_GROUNDITEM = new Client();
        public static final Client CL_USEWITH_INVITEM = new Client();
        public static final Client CL_USEWITH_NPC = new Client();
        public static final Client CL_USEWITH_OBJECT = new Client();
        public static final Client CL_USEWITH_PLAYER = new Client();
        public static final Client CL_USEWITH_WALLOBJECT = new Client();
        public static final Client CL_WALK = new Client();
        public static final Client CL_WALK_ACTION = new Client();
        public static final Client CL_WALL_OBJECT_COMMAND1 = new Client();
        public static final Client CL_WALL_OBJECT_COMMAND2 = new Client();
        public static final Client UNKNOWN = new Client();

        private Client() {}
    }

    public static final class Server {
        public static final Server SV_APPEARANCE = new Server("SV_APPEARANCE");
        public static final Server SV_BANK_CLOSE = new Server("SV_BANK_CLOSE");
        public static final Server SV_BANK_OPEN = new Server("SV_BANK_OPEN");
        public static final Server SV_BANK_UPDATE = new Server("SV_BANK_UPDATE");
        public static final Server SV_CLOSE_CONNECTION = new Server("SV_CLOSE_CONNECTION");
        public static final Server SV_DUEL_ACCEPTED = new Server("SV_DUEL_ACCEPTED");
        public static final Server SV_DUEL_CLOSE = new Server("SV_DUEL_CLOSE");
        public static final Server SV_DUEL_CONFIRM_OPEN = new Server("SV_DUEL_CONFIRM_OPEN");
        public static final Server SV_DUEL_OPEN = new Server("SV_DUEL_OPEN");
        public static final Server SV_DUEL_OPPONENT_ACCEPTED = new Server("SV_DUEL_OPPONENT_ACCEPTED");
        public static final Server SV_DUEL_SETTINGS = new Server("SV_DUEL_SETTINGS");
        public static final Server SV_DUEL_UPDATE = new Server("SV_DUEL_UPDATE");
        public static final Server SV_FRIEND_LIST = new Server("SV_FRIEND_LIST");
        public static final Server SV_FRIEND_MESSAGE = new Server("SV_FRIEND_MESSAGE");
        public static final Server SV_FRIEND_STATUS_CHANGE = new Server("SV_FRIEND_STATUS_CHANGE");
        public static final Server SV_GAME_SETTINGS = new Server("SV_GAME_SETTINGS");
        public static final Server SV_IGNORE_LIST = new Server("SV_IGNORE_LIST");
        public static final Server SV_INVENTORY_ITEMS = new Server("SV_INVENTORY_ITEMS");
        public static final Server SV_INVENTORY_ITEM_REMOVE = new Server("SV_INVENTORY_ITEM_REMOVE");
        public static final Server SV_INVENTORY_ITEM_UPDATE = new Server("SV_INVENTORY_ITEM_UPDATE");
        public static final Server SV_LOGOUT_DENY = new Server("SV_LOGOUT_DENY");
        public static final Server SV_MESSAGE = new Server("SV_MESSAGE");
        public static final Server SV_OPTION_LIST = new Server("SV_OPTION_LIST");
        public static final Server SV_OPTION_LIST_CLOSE = new Server("SV_OPTION_LIST_CLOSE");
        public static final Server SV_PLAYER_DIED = new Server("SV_PLAYER_DIED");
        public static final Server SV_PLAYER_QUEST_LIST = new Server("SV_PLAYER_QUEST_LIST");
        public static final Server SV_PLAYER_STAT_EQUIPMENT_BONUS = new Server("SV_PLAYER_STAT_EQUIPMENT_BONUS");
        public static final Server SV_PLAYER_STAT_EXPERIENCE_UPDATE = new Server("SV_PLAYER_STAT_EXPERIENCE_UPDATE");
        public static final Server SV_PLAYER_STAT_FATIGUE = new Server("SV_PLAYER_STAT_FATIGUE");
        public static final Server SV_PLAYER_STAT_FATIGUE_ASLEEP = new Server("SV_PLAYER_STAT_FATIGUE_ASLEEP");
        public static final Server SV_PLAYER_STAT_LIST = new Server("SV_PLAYER_STAT_LIST");
        public static final Server SV_PLAYER_STAT_UPDATE = new Server("SV_PLAYER_STAT_UPDATE");
        public static final Server SV_PRAYER_STATUS = new Server("SV_PRAYER_STATUS");
        public static final Server SV_PRIVACY_SETTINGS = new Server("SV_PRIVACY_SETTINGS");
        public static final Server SV_REGION_ENTITY_UPDATE = new Server("SV_REGION_ENTITY_UPDATE");
        public static final Server SV_REGION_GROUND_ITEMS = new Server("SV_REGION_GROUND_ITEMS");
        public static final Server SV_REGION_NPCS = new Server("SV_REGION_NPCS");
        public static final Server SV_REGION_NPC_UPDATE = new Server("SV_REGION_NPC_UPDATE");
        public static final Server SV_REGION_OBJECTS = new Server("SV_REGION_OBJECTS");
        public static final Server SV_REGION_PLAYERS = new Server("SV_REGION_PLAYERS");
        public static final Server SV_REGION_PLAYER_UPDATE = new Server("SV_REGION_PLAYER_UPDATE");
        public static final Server SV_REGION_WALL_OBJECTS = new Server("SV_REGION_WALL_OBJECTS");
        public static final Server SV_SERVER_MESSAGE = new Server("SV_SERVER_MESSAGE");
        public static final Server SV_SERVER_MESSAGE_ONTOP = new Server("SV_SERVER_MESSAGE_ONTOP");
        public static final Server SV_SHOP_CLOSE = new Server("SV_SHOP_CLOSE");
        public static final Server SV_SHOP_OPEN = new Server("SV_SHOP_OPEN");
        public static final Server SV_SLEEP_CLOSE = new Server("SV_SLEEP_CLOSE");
        public static final Server SV_SLEEP_INCORRECT = new Server("SV_SLEEP_INCORRECT");
        public static final Server SV_SLEEP_OPEN = new Server("SV_SLEEP_OPEN");
        public static final Server SV_SOUND = new Server("SV_SOUND");
        public static final Server SV_SYSTEM_UPDATE = new Server("SV_SYSTEM_UPDATE");
        public static final Server SV_TELEPORT_BUBBLE = new Server("SV_TELEPORT_BUBBLE");
        public static final Server SV_TRADE_CLOSE = new Server("SV_TRADE_CLOSE");
        public static final Server SV_TRADE_CONFIRM_OPEN = new Server("SV_TRADE_CONFIRM_OPEN");
        public static final Server SV_TRADE_ITEMS = new Server("SV_TRADE_ITEMS");
        public static final Server SV_TRADE_OPEN = new Server("SV_TRADE_OPEN");
        public static final Server SV_TRADE_RECIPIENT_STATUS = new Server("SV_TRADE_RECIPIENT_STATUS");
        public static final Server SV_TRADE_STATUS = new Server("SV_TRADE_STATUS");
        public static final Server SV_WELCOME = new Server("SV_WELCOME");
        public static final Server SV_WORLD_INFO = new Server("SV_WORLD_INFO");
        public static final Server UNKNOWN = new Server("UNKNOWN");

        private final String name;

        private Server(String name) {
            this.name = name;
        }

        public String name() {
            return name;
        }

        public String toString() {
            return name;
        }
    }
}
