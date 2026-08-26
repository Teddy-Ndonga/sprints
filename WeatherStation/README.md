# Weather Station

This sprint implements a `WeatherStation` class that maintains the full known state of a weather station while processing partial telemetry updates.

## Requirements

The `WeatherStation` class should:

- Maintain the current state of a weather station.
- Convert numerical sensor IDs into internal data point names.
- Process comma-separated telemetry messages.
- Support multiple updates in a single message.
- Remember previous values when a new message only contains partial updates.
- Store unknown data point values as `NULL` initially.
- Handle explicit `NULL` sensor values.
- Ignore unknown sensor IDs.
- Return the complete state ordered by sensor ID.
- Clear all values back to `NULL` when requested.

## Data Point Mapping

| ID | Key |
|---:|---|
| 1 | `airTemp` |
| 2 | `airPressure` |
| 7 | `precipitation` |
| 11 | `windSpeed` |
| 12 | `windDirection` |
| 13 | `humidity` |
| 14 | `dewPoint` |
| 15 | `soilMoisture` |
| 22 | `cloudCover` |

## Implementation

```java
package sprint;

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

Usage
Create a Main.java file:

import sprint.WeatherStation;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        System.out.print(weatherStation.getState());

        System.out.println("--- Updating State ---");

        weatherStation.updateState("11,15.5");
        weatherStation.updateState("13,32.3");

        System.out.print(weatherStation.getState());

        System.out.println("--- Batch Update ---");

        weatherStation.updateState("11,15.7\n13,33.1");

        System.out.print(weatherStation.getState());

        System.out.println("--- Clearing State ---");

        weatherStation.clearState();

        System.out.print(weatherStation.getState());
    }
}

Build and Run
From the WeatherStation directory:

javac -d build WeatherStation.java Main.java
java -cp build Main

Initial State
When a WeatherStation is created, every known data point starts as NULL:

airTemp:NULL
airPressure:NULL
precipitation:NULL
windSpeed:NULL
windDirection:NULL
humidity:NULL
dewPoint:NULL
soilMoisture:NULL
cloudCover:NULL

Updating State
A partial update only changes the data points included in the message.

For example:

weatherStation.updateState("11,15.5");
weatherStation.updateState("13,32.3");

Results in:

airTemp:NULL
airPressure:NULL
precipitation:NULL
windSpeed:15.5
windDirection:NULL
humidity:32.3
dewPoint:NULL
soilMoisture:NULL
cloudCover:NULL

Previous values remain available when they are not included in a subsequent update.

Batch Updates
Multiple updates can be processed in a single message using newline-separated records:

11,15.7
13,33.1

This is equivalent to updating the values separately.

Clearing State
Calling:

weatherStation.clearState();

resets every known data point to NULL.

Key Concepts
Map
LinkedHashMap
State management
CSV parsing
String splitting
Incremental updates
Data transformation
StringBuilder
Encapsulation
Useful Links
Java Map
LinkedHashMap
String split
