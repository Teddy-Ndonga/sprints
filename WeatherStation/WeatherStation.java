package WeatherStation;

import java.util.LinkedHashMap;
import java.util.Map;

public class WeatherStation {

    private final Map<Integer, String> idToKey = new LinkedHashMap<>();
    private final Map<String, String> state = new LinkedHashMap<>();

    public WeatherStation() {

        idToKey.put(1, "airTemp");
        idToKey.put(2, "airPressure");
        idToKey.put(7, "precipitation");
        idToKey.put(11, "windSpeed");
        idToKey.put(12, "windDirection");
        idToKey.put(13, "humidity");
        idToKey.put(14, "dewPoint");
        idToKey.put(15, "soilMoisture");
        idToKey.put(22, "cloudCover");

        clearState();
    }


    public void updateState(String message) {

        String[] updates = message.split("\n");

        for (String update : updates) {

            String[] data = update.split(",");

            int id = Integer.parseInt(data[0]);

            // Ignore unknown IDs
            if (!idToKey.containsKey(id)) {
                continue;
            }

            String key = idToKey.get(id);
            String value = data[1];

            if (value.equals("NULL")) {
                state.put(key, "NULL");
            } else {
                state.put(key, String.valueOf(Float.parseFloat(value)));
            }
         }
    }


    public String getState() {

        StringBuilder result = new StringBuilder();

        for (String key : state.keySet()) {

            result.append(key)
                  .append(":")
                  .append(state.get(key))
                  .append("\n");
        }

        return result.toString();
    }


    public void clearState() {

        for (String key : idToKey.values()) {
            state.put(key, "NULL");
        }
    }
}