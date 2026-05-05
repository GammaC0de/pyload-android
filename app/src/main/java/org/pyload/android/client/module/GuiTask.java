package org.pyload.android.client.module;

public class GuiTask {

	private final Runnable task;
	private final Runnable success;
	
	//how often the task can be called
	public int tries = 2;
	
	// called when anything goes wrong (optional)
	private Runnable critical;
	
	public GuiTask(Runnable task){
		this.task = task;
		// Nop
		this.success = new Runnable() {
			
			
			public void run() {				
			}
		};
	}
	
	public GuiTask(Runnable task, Runnable success) {
		this.task = task;
		this.success = success;
	}
	
	public Runnable getTask(){
		return task;
	}
	
	public Runnable getSuccess(){
		return success;
	}
	
	public boolean hasCritical(){
		return (critical != null);
	}

	public void setCritical(Runnable critical) {
		this.critical = critical;
	}

	public Runnable getCritical() {
		return critical;
	}
	
}
