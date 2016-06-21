package design_pattern_practice.chainofresponsibility;

public abstract class Logger {
	private Logger nextLogger;
	
	public Logger getNextLogger() {
		return nextLogger;
	}

	public void setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	public void logMessage(String message) {
		log(message);
		if(nextLogger != null){
			nextLogger.logMessage(message);
		}
	}

	public abstract void log(String message);
}
