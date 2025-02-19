package mywork.collection;

enum Priority{
    HIGH,LOW,MEDIUM
}

enum Status {
    IN_QUEUE,ASSIGNED,IN_PROGRESS,COMPLETED
}

public class Task implements Comparable<Task>{
    private String assignee;
    private String projectName;
    private String description;
    private Status status;
    private Priority priority;

    public Task(Priority priority, String assignee, String projectName, String description) {
        this(assignee,projectName,description,assignee==null?Status.IN_QUEUE:Status.IN_PROGRESS,priority);
    }

    public Task(String projectName, String description, Priority priority) {
      this(priority,null,projectName,description);
    }

    public Task(String assignee, String projectName, String description, Status status, Priority priority) {
        this.assignee = assignee;
        this.projectName = projectName;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "%-20s %-20s %-10s %-10s %s".formatted(projectName,description,priority,assignee,status);
    }

    public Priority getPriority() {
        return priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;
        return projectName.equals(task.projectName) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        int result = projectName.hashCode();
        result = 31 * result + description.hashCode();
        return result;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public int compareTo(Task o) {
        if(this.projectName.compareTo(o.projectName)==0)
            System.out.println("project name is same");
        return this.description.compareTo(o.description);
    }
}
