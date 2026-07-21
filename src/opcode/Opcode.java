package opcode;

import opcode.version.v202;
import opcode.version.v204;

import java.util.Iterator;
import java.util.Map;

public class Opcode {

    public static Command.Server getServer(int version, int id) {
        try {
            Map m;
            if (version == 202) {
                m = v202.server;
            } else {
                m = v204.server;
            }
            for (Iterator it = m.entrySet().iterator(); it.hasNext();) {
                Map.Entry e = (Map.Entry)it.next();
                if (((Integer)e.getValue()).intValue() == id) {
                    return (Command.Server)e.getKey();
                }
            }
        } catch (Exception ignored) {
        }
        return Command.Server.UNKNOWN;
    }

    public static int getClient(int version, Command.Client opcode) {
        try {
            Map m;
            if (version == 202) {
                m = v202.client;
            } else {
                m = v204.client;
            }
            Integer value = (Integer)m.get(opcode);
            if (value != null) {
                return value.intValue();
            }
        } catch (Exception ignored) {
        }
        return -1;
    }

}
