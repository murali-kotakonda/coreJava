package similar;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

public class CacheImpl {
  
class Entry{
	
	long milliSeconds;
	DataSource datasource;
	
	public boolean isExpired() {
		long diff= System.currentTimeMillis() - milliSeconds;
		return diff>expiry;
	}

	public Entry(long milliSeconds, DataSource datasource) {
		super();
		this.milliSeconds = milliSeconds;
		this.datasource = datasource;
	}
	
	
}

 static int MAX =30;
 static Map<String,Entry> cache = new HashMap<>(MAX);
 static Long expiry = 360000L;
 
 static {
	 //REMOVES ANY EXPIRED entry for every 1 hour
	 
 }
 	
 public DataSource getDataSource(String tenant) {
	 Entry entry = cache.get(tenant);
	 if(entry.isExpired()) {
		 //get data  from the managed service
		 DataSource d = null;
		 entry = new Entry(System.currentTimeMillis(), d ); 
		 put(tenant, entry);
	 }
	 return entry.datasource;
 }

private synchronized void put(String tenant, Entry entry) {
	if(cache.size() == MAX) {
		//REMOVE one expired recently
		//or else remove the top 
	}
   cache.put(tenant, entry);
}
 
}
