package org.JavaAutomation.gitworkflow;

public class GitWorkFlow {
    public static void main(String[] args) {
        String step1= "Perform git stash - to store the uncommitted changes ";
        String step2= " Perform git checkout master - to move to the local master branch ";
        String step3= "Perform git fetch command - to fetch the origin branches" ;
        String step4= "Perform git checkout -b new_branch_name command - to create and instantly move to a new branch, "+ "that is identical to local master branch" ;
        String step5 = "Add you changes that related to the task";
        String step6 = "Review your changes and check your code before committing them ";
        String step7 = "Execute git commit by using the IntelliJ interface , where you can select what changes you want to commit" ;
        String step8 = "Once all the changes, are committed execute a git push command by using CTRL+ALT+K keys";
        String step9 = "The committed changes are pushed to on origin branch with the same name, navigate to the GitHub branch";
        String step10= "Create a Pull Request from origin/new_branch_name into origin/master ";
        String step11 = "Add the Pull Request details - name, description and request review from your colleagues";
        String step12 = "If you collect at least 2 approvals from your colleagues the merge the branch " ;
        String step13 = "After that, the origin/master contains the latest changes ant the origin/new_branch_name can be deleted";
        String step14 = "Do not forget that locally you are still on the new_branch_name, it's good to move back to master";
        String step15 = "However< the local master branch does not have the latest changes, therefore perform a git fetch and git pull";


        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);
        System.out.println(step4);
        System.out.println(step5);
        System.out.println(step6);
        System.out.println(step7);
        System.out.println(step8);
        System.out.println(step9);
        System.out.println(step10);
        System.out.println(step11);
        System.out.println(step12);
        System.out.println(step13);
        System.out.println(step14);
        System.out.println(step15);
    }
}
