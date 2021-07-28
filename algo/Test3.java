
/**
 We need to design a log framework:
It should meet below requirements:
1. It should support multiple log levels : INFO, WARN, FINE ,FINER, ERROR
2. Framework should support dynamic log levels
3.  based on log level the date format and string logged must be different. 
For EX: WAR, ERROR must be logged as bold text along with a nanoseconds timestamp 
but for others until seconds is enough but date format and message format can be customized.
4. Framework should support multiple output channels 
like Console, Text, Centralized log aggregator etc..
5. Users can dynamically add support channels
6. Whenever an ERROR occurs(Cofigurable what does an ERROR mean to the end user)
 then multiple alert managers must be informed. It may be sending notification to slack channel,
 sending an SMS to the developer, Invoke Rest API etc.. 
7. Alert managers can be any number  and should be configurable by the user of the framework

 */

public class Test3 {

	
}
