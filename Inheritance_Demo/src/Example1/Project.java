package Example1;

public class Project {
	private int pid;
	private String projectName;
	private String clientName;
	private double cost;
	
	public Project() {
		
	}

	public Project(int pid, String projectName, String clientName, double cost) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.clientName = clientName;
		this.cost = cost;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", clientName=" + clientName + ", cost=" + cost
				+ "]";
	}
	
	
	
}
