1. What is Version Control System(V.C.S.) ?
Version Control System (VCS) is a software tool that manages changes made to source code
or any other set of files. It enables developers to keep track of modifications to the code,
and allows them to collaborate on the same codebase.
The primary function of a VCS is to keep a record of changes made to a file or a group of
files, including the person who made the changes, when they made them, and what changes
they made. This allows developers to work on the same codebase without overwriting each
other's changes or losing track of different versions of the code.
VCS also enables developers to revert to earlier versions of the code if necessary, making it
easier to fix bugs or undo changes that caused issues. Additionally, it enables developers to
work on multiple branches of the code simultaneously, which can be merged back together
when changes are ready.
Some popular VCSs include Git, Mercurial, and Subversion.
2. Why we need any Version Control System(v.C.S)?
There are several reasons why we need a Version Control System (VCS):
Collaboration: VCS enables multiple developers to work on the same codebase
simultaneously, without interfering with each other's work. It allows developers to make
changes to the codebase and see the changes made by others, facilitating collaboration and
teamwork.
Versioning: VCS allows developers to keep track of different versions of the codebase. It
provides a history of changes made to the code, enabling developers to revert to earlier
versions if necessary, and compare changes made over time.
Backup and Disaster Recovery: VCS provides a backup mechanism for the codebase, which
can be used in the event of a system failure or data loss. It allows developers to restore the
codebase to an earlier version, ensuring that no work is lost.
Testing and Quality Assurance: VCS enables developers to create different branches of the
codebase for testing and experimentation. It allows them to try out new features without
affecting the main codebase, ensuring that the code remains stable and error-free.
Security: VCS provides security features like access control, which allows developers to
control who can make changes to the codebase. It also enables developers to track changes
made to the codebase and identify any potential security vulnerabilities.
Overall, VCS is an essential tool for software development, enabling developers to work
efficiently, collaboratively, and with confidence in the stability and security of the codebase.
3. What is the difference between SVN and Git?
Subversion (SVN) and Git are two popular Version Control Systems (VCS) used in software
development. Here are some of the key differences between the two:
Centralized vs. Distributed: SVN is a centralized VCS, which means that there is a single
central repository that stores all versions of the code. Developers must synchronize their
changes with the central repository. Git, on the other hand, is a distributed VCS, which
means that every developer has their own local repository, and changes can be synchronized
between repositories.Speed: Git is generally considered to be faster than SVN, especially when it comes to
operations like branching and merging.
Branching and Merging: Git makes branching and merging much easier and more flexible
than SVN. In SVN, branching and merging can be complex and time-consuming, while Git
makes it a much simpler and faster process.
Offline Work: Git allows developers to work offline and make changes to their local
repository, while SVN requires a network connection to access the central repository.
Command Line vs. GUI: SVN has a user-friendly GUI interface, while Git relies heavily on the
command line interface, which can be more challenging for some developers.
Learning Curve: Git has a steeper learning curve than SVN due to its advanced features and
command-line interface.
Overall, both SVN and Git have their strengths and weaknesses, and the choice between
them depends on the specific needs and requirements of the software development team.
SVN may be more suitable for smaller teams or those who prefer a more straightforward
workflow, while Git is preferred for larger teams, complex projects, and more advanced
users.
4. Which VCS you prefer? SVN Or Git? Why?
SVN is a centralized VCS, which means that it can be easier to set up and manage than Git.
SVN is also easier to learn and use for developers who are not familiar with VCS. It has a
user-friendly GUI interface and supports features like file locking, which can be useful for
certain types of projects.
Git, on the other hand, is a distributed VCS that offers several advantages over SVN. It is
faster, more flexible, and better suited for larger teams and complex projects. Git also
supports branching and merging more efficiently, making it easier for developers to work
collaboratively on different parts of the codebase. Git also provides better support for offline
work and allows developers to work more independently.
Overall, the choice between SVN and Git depends on the specific needs and requirements of
the software development team. SVN may be more suitable for smaller teams or projects
with simpler workflows, while Git is preferred for larger teams, complex projects, and more
advanced users.
5. What are the advantages of Git over SVN?
Git offers several advantages over SVN, including:
Distributed Architecture: Git is a distributed version control system, meaning that every
developer has a local copy of the repository, which enables them to work independently,
make changes, and commit them without requiring network access or a connection to a
central server. This makes it faster and more flexible than SVN, especially for larger projects.Faster Performance: Git is designed to be faster than SVN, especially when it comes to
operations like branching, merging, and history traversal. This is because Git stores the
entire history of the project locally, enabling developers to perform operations quickly
without having to access a remote server.
Flexible Branching and Merging: Git's branching and merging capabilities are more flexible
than SVN, making it easier to work on multiple branches simultaneously and merge them
back together. This makes it easier for teams to work on different parts of the codebase
without interfering with each other's work.
Better Collaboration: Git's distributed architecture makes it easier for teams to collaborate,
especially when working remotely. Developers can work independently on different parts of
the codebase, and changes can be easily merged back together without conflict.
Better Tooling and Integration: Git has a vast ecosystem of tools and integrations, making it
easy to integrate with other software development tools and platforms. This includes tools
for code review, continuous integration, deployment, and more.
Overall, Git's distributed architecture, faster performance, flexible branching and merging,
and better collaboration and tooling make it a more advanced and preferred choice for
many software development teams.
6. Why we call Git as Distributed VCS?
Git is called a distributed version control system because it allows every developer to have a
complete copy of the entire repository on their local machine. This means that there is no
single central repository that all developers must connect to or rely on, as is the case with
centralized version control systems like SVN.
Instead, each developer has their own local repository, which they can commit changes to
and then push those changes to other repositories or a central server. This allows
developers to work independently without being dependent on a network connection or a
central server. It also means that if the central server goes down, developers can continue to
work and collaborate using their local repositories.
The distributed architecture of Git provides several advantages over centralized version
control systems. It enables faster and more flexible branching and merging, as developers
can work on separate branches independently and then merge their changes back together.
It also allows for better collaboration and communication among developers, as they can
easily share changes and review code without relying on a central server.
7. Can you explain Git's End-to-End work flow?
Creating a Repository: The first step is to create a new Git repository, either by initializing a
new one or by cloning an existing one.
Working on a Branch: Developers typically work on a separate branch in Git to make changes
to the codebase without affecting the main codebase. They create a new branch using the
"git branch" command and then switch to that branch using the "git checkout" command.Making Changes: Once they are on a separate branch, developers can make changes to the
codebase by modifying existing files, adding new files, or deleting files. They can track these
changes using the "git add" command to stage the changes and the "git commit" command
to save the changes to the local repository.
Pushing Changes: Once the changes are committed to the local repository, developers can
push their changes to a remote repository or share them with others using the "git push"
command.
Reviewing Changes: Other developers can review the changes and provide feedback using
pull requests or code reviews. They can make comments, request changes, or approve the
changes to be merged into the main codebase.
Merging Changes: Once the changes are approved, they can be merged into the main
codebase using the "git merge" command. This incorporates the changes from the separate
branch into the main codebase, while preserving the history of the changes.
Updating the Local Repository: Finally, all developers can update their local repository with
the latest changes from the remote repository using the "git pull" command. This ensures
that everyone has the latest version of the codebase and can continue working on it.
This end-to-end workflow is designed to be flexible and enable efficient collaboration among
developers, while also providing version control and history tracking for the codebase.
8. How do you clone the code using git?
Open a terminal or command prompt on your local machine.
Navigate to the directory where you want to store the cloned repository.
Type the following command: git clone <repository_url>
9. What is the difference between Commit & Push?
Commit: When you commit changes in Git, you are creating a new snapshot of the codebase
that represents the state of the repository at that point in time. The commit captures all the
changes you have made since the last commit and includes a message that describes the
changes you have made. This operation is local to your machine, and the changes are only
saved to your local repository.
Push: When you push changes in Git, you are sending the committed changes from your
local repository to a remote repository, typically hosted on a Git server like GitHub or GitLab.
This operation updates the remote repository with the changes you have made and makes
them available to other developers who have access to the same repository.
10. Can you explain Git architecture?
Working directory: This is the directory where you keep your files and folders, and where
you do your work. When you modify a file in the working directory, Git tracks the changes
you make and stores them in a staging area.
Staging area: This is an intermediate area between the working directory and the repository.
The staging area is where you prepare your changes before you commit them to therepository. When you make changes to a file in the working directory, you add those
changes to the staging area using the "git add" command.
Repository: This is the database that stores all of the changes you make to your files over
time. The repository is located on your local machine, but you can also push it to a remote
server, such as GitHub or Bitbucket. When you commit your changes to the repository using
the "git commit" command, Git stores a snapshot of your changes in the repository along
with a commit message that describes the changes you made.
11. What is the diff. bet'n Centralized and Distributed VCS
Centralized Version Control Systems (CVCS) and Distributed Version Control Systems (DVCS)
are two different approaches to managing the versions of code in software development.
CVCS is a traditional version control system where there is a single central repository that
holds all the codebase. In this model, all developers have a local copy of the codebase, and
they check out files from the central repository to work on them. When they make changes,
they commit those changes back to the central repository. Examples of CVCS include
Subversion (SVN) and Perforce.
DVCS, on the other hand, is a newer model where each developer has a full copy of the
codebase on their local machine. This means that there is no need for a central repository,
and developers can work on their local copy without needing to be connected to a server.
When they want to share their changes with other developers, they can push their changes
to a shared repository or pull changes from other developers' repositories. Examples of
DVCS include Git and Mercurial.
The main difference between the two models is the way they handle collaboration and
distribution of code. In a CVCS, there is a central repository that acts as the single source of
truth for the codebase. This can make it easier to manage access control and enforce
workflows, but it can also make it more difficult to work offline or collaborate across teams
that are geographically dispersed. In a DVCS, each developer has a full copy of the codebase
on their local machine, which makes it easier to work offline and collaborate with
geographically dispersed teams. However, it can also make it more challenging to manage
access control and enforce workflows, as there is no central authority to manage
these aspect.
12. Have you ever created Remote repositories in Git? How?
Create a new repository on a Git hosting service, such as GitHub, GitLab, or Bitbucket.
Open the terminal/command prompt on your local machine.
Change the current working directory to your local project.
Initialize the local directory as a Git repository using the git init command.
Add the files in your local repository and stage them for commit using the git add
command.
Commit the files that you've staged using the git commit command.
Copy the URL of the remote repository from the hosting service.
Set the remote repository URL using the git remote command, with the add option to add a
new remote, and a chosen name for the remote repository, followed by the URL you just
copied. For example, git remote add origin
https://github.com/yourusername/yourrepository.git
Verify the remote repository by running the git remote -v command.Push the changes in your local repository to the remote repository using the git push
command, followed by the name of the remote repository and the name of the branch you
want to push. For example, git push -u origin master.
13. What happens if I delete .git folder?
If you delete the ".git" folder from your Git repository, you will essentially remove the Git
version control system from your project. This means that Git will no longer track changes to
your files, and you will not be able to use Git commands to manage your project.
In particular, the following consequences will occur when you delete the ".git" folder:
Your Git history will be lost: The ".git" folder contains all of the metadata that Git uses to
track changes to your files, including your commit history, branches, tags, and more. When
you delete the ".git" folder, you will lose all of this metadata, and you will not be able to
retrieve any of your previous commits. Your project will no longer be under version control:
Git provides a number of features for managing your code, including branching, merging,
and reverting changes. When you delete the ".git" folder, you will lose all of these features,
and you will need to rely on other tools to manage your code.
Your working directory will be unaffected: Deleting the ".git" folder will not affect the files in
your working directory. This means that your code files will still be present, but they will no
longer be tracked by Git.
14. How do you configure username, email and editor first time in Git?
Open the terminal/command prompt on your local machine. Type in the following
commands to set your username and email address:
git config --global user.name "Your Name"
git config --global user.email youremail@example.com
15. Where Git stores configuration details?
System-level configuration: This configuration applies to all users on the current machine
and is stored in the /etc/gitconfig file. You can set system-level configuration settings using
the --system flag with the git config command.
Global user-level configuration: This configuration applies to the current user on the current
machine and is stored in the ~/.gitconfig file. You can set global configuration settings using
the --global flag with the git config command. Local repository-level configuration:
This configuration applies to the current repository and is stored in the .git/config file in the
root directory of the repository. You can set local repository-level configuration settings
using the git config command without any flags.
16. What is the advantage of STAGE in Git?
The staging area (also known as the "index") is a fundamental feature of Git that provides
several advantages, including:
Selective commits: The staging area allows you to selectively choose which changes to
include in a commit. You can choose to stage only the changes that are ready to be
committed while keeping other changes separate. This gives you more control over your
commit history and helps you keep your changes organized.Preview changes: The staging area lets you preview the changes that you're about to
commit before actually committing them. This helps you catch mistakes or unwanted
changes before they're permanently recorded in your Git history.
Collaborative development: The staging area makes it easier to collaborate with others on
a project by providing a way to share and review changes before they're committed. You can
stage changes, push them to a remote repository, and then ask other team members to
review them before you finalize the commit.
Multiple edits: The staging area allows you to make multiple edits to your working
directory without committing them immediately. This gives you the flexibility to experiment
with changes or work on multiple features simultaneously, while still keeping your changes
organized and manageable.
17. What is SHA-1? How Git uses this?
Git uses SHA-1 extensively to uniquely identify and track the changes to files and directories
in a repository. When you make changes to a file in a Git repository, Git creates a unique
SHA-1 hash value for the new version of the file. Git then stores this hash value in its object
database along with the content of the file.
Git uses SHA-1 in the following ways:
Object database: Git stores all of its objects, including files, directories, and commits, in its
object database using unique SHA-1 hash values to identify each object.
Commit history: Git uses the SHA-1 hashes of commits to build the commit history of a
repository. Each commit is identified by a unique SHA-1 hash value that represents the state
of the repository at that point in time.
Branches and tags: Git uses SHA-1 hashes to identify branches and tags in a repository. Each
branch and tag is associated with a specific commit identified by its SHA-1 hash value.
Because SHA-1 produces a unique hash value for any given input data, Git can use these
hash values to ensure the integrity and authenticity of the data in a repository. If any data in
the repository is modified or corrupted, the corresponding SHA-1 hash value will also
change, allowing Git to detect and report the error.
18. I have a file modified in my Working directory. How do you show the content diff?
To show the content diff of a file that has been modified in your working directory, you can
use the git diff command. Here's how:
Open the terminal/command prompt on your local machine.
Navigate to the root directory of your Git repository.
Type the following command, replacing "file.txt" with the name of the file you want to
compare:
git diff file.txt
This will display the differences between the modified version of the file in your working
directory and the most recent committed version of the file.19. How do you show the content diff of a file which is staged?
To show the content diff of a file that is staged in Git, you can use the git diff --cached
command. Here's how:
Open the terminal/command prompt on your local machine.
Navigate to the root directory of your Git repository.
Type the following command, replacing "file.txt" with the name of the file you want to
compare:
git diff --cached file.txt
This will display the differences between the staged version of the file and the most recent
committed version of the file.
Alternatively, if you want to compare the staged version of the file to a specific commit or
branch, you can specify the commit or branch name as follows:
git diff --cached <commit or branch> file.txt
This will show the differences between the staged version of the file and the version of the
file at the specified commit or branch.
You can also use the --color-words flag to highlight the differences between the two versions
of the file in a more readable way:
git diff --cached --color-words file.txt
This will highlight the added and deleted words in green and red, respectively.
20. What is your branching strategy? OR Can you explain your release process/Strategy?
One popular branching strategy is the Gitflow workflow, which involves creating two main
branches: master and develop. The master branch represents the stable production code
while the develop branch contains the latest development changes. New features are
developed in separate feature branches, which are created off the develop branch and
merged back into it when complete. Release branches are created off the develop branch to
prepare for a new release, and hotfix branches are created off the master branch to fix
critical issues.
Another branching strategy is the trunk-based development, which involves having a single
mainline branch, such as main or master, and committing changes directly to it. This
approach relies on continuous integration and continuous delivery to catch and fix issues
early. Feature flags and experimentation can also be used to isolate and test new features
before they are released.
Ultimately, the choice of branching strategy depends on the specific needs and goals of the
project and the team.
21. What branching model you suggest for parallel development?
For parallel development, a branching model that provides a clear separation of code
changes and facilitates parallel development efforts would be ideal. One such branching
model is Gitflow, which is designed to support parallel development efforts and provides a
logical and manageable workflow.Gitflow involves creating two main branches: master and develop. The master branch
represents the stable production code, while the develop branch contains the latest
development changes.
New features are developed in separate feature branches, which are created off the develop
branch and merged back into it when complete. This allows multiple developers to work on
different features simultaneously without interfering with each other's work.
Hotfix branches are also created off the master branch to fix critical issues that arise in the
production code. These branches are merged back into both the master and develop
branches to ensure that the fix is included in both the production and development code.
This branching model provides a clear separation of code changes and facilitates parallel
development efforts. It also promotes code stability by ensuring that only stable and tested
code is merged into the master branch. However, it may require more effort to manage and
coordinate multiple branches, so it may not be suitable for all development teams or
projects.
22. Developer fixes a bug. How do you take the change to production?
Verify the fix: Before deploying the bug fix to production, ensure that it has been properly
tested and verified by the development team. This includes ensuring that all automated
tests have passed and that the fix has been manually tested in a staging or pre-production
environment.
Create a release branch: Create a new release branch off the main branch, such as master
or main, with a name that reflects the bug fix, such as bugfix-123. This branch is used to
prepare the code for deployment to production.
Deploy to production environment: Deploy the release branch to the production
environment using your deployment tool or process. This may involve running scripts,
executing build commands, or deploying packages to production servers.
Monitor and verify: Once the bug fix has been deployed to production, monitor the
system for any issues or errors that may arise. Verify that the bug fix has indeed resolved the
issue.
Merge changes to main branch: After the bug fix has been successfully deployed and
tested in production, merge the release branch back into the main branch, such as master or
main. This ensures that the bug fix is incorporated into the main codebase for future
deployments.
Update documentation: Finally, update any relevant documentation, such as release notes
or user guides, to reflect the bug fix.
It's important to have a well-defined and tested deployment process to ensure that
production deployments are consistent, stable, and properly documented.
23. Explain defferent branching models that you have worked-on.
Gitflow: Gitflow is a branching model that defines a specific workflow for creating and
merging branches in Git. It involves creating two main branches, master and develop, and
creating separate feature branches for new development work. Release branches arecreated off the develop branch to prepare for a new release, and hotfix branches are
created off the master branch to fix critical issues.
Trunk-Based Development: Trunk-Based Development is a branching model that
emphasizes continuous integration and delivery. It involves having a single mainline branch,
such as main or master, and committing changes directly to it. This approach relies on
continuous integration and delivery to catch and fix issues early. Feature flags and
experimentation can also be used to isolate and test new features before they are released.
Feature Branching: Feature Branching is a branching model that involves creating a new
branch for each new feature or task. Changes are made on the feature branch and then
merged back into the main branch once complete. This model allows for parallel
development efforts and facilitates code reviews and testing of individual features.
Release Branching: Release Branching is a branching model that involves creating a
separate branch for each new release. Changes for the release are made on the release
branch and then merged back into the main branch once complete. This model provides a
clear separation of code changes and facilitates parallel development efforts.
24. Did you work on merging the code in Git?
Merging is the process of combining changes from different branches in Git. When you
merge two branches, Git takes the changes from one branch and applies them to another
branch. This is typically done when you want to integrate changes from a feature branch
into the main branch, or when you want to merge changes from one branch into another.
There are two main types of merges in Git: fast-forward and three-way merge. A fast-
forward merge is a simple merge that occurs when the current branch has not diverged from
the branch being merged. In this case, Git simply moves the current branch pointer forward
to the same commit as the other branch.
A Real merge, on the other hand, is a more complex merge that occurs when the current
branch and the branch being merged have diverged. In this case, Git creates a new merge
commit that combines the changes from both branches. Git uses a merge algorithm to
automatically combine changes where possible, but in some cases, you may need to
manually resolve conflicts between the changes.
In Git, you typically use the git merge command to merge changes between branches. When
you run git merge, Git creates a new merge commit that represents the combined changes
between the two branches. It's important to review the changes and resolve any conflicts
before committing the merge.
Overall, merging is an essential part of the Git workflow and enables teams to collaborate on
code changes in a structured and efficient way.
25. What is merge?
When you merge two branches in Git, you create a new commit that contains the combined
changes from both branches. Git uses a merge algorithm to automatically combine changes
where possible, but in some cases, you may need to manually resolve conflicts between the
changes.
There are different types of merges in Git, including:Fast-Forward Merge: If the changes in the branch being merged can be applied directly to
the current branch without any conflicts, Git performs a fast-forward merge. In this case, the
branch pointer is simply moved forward to the latest commit on the other branch.
Real Merge: If there are conflicts between the changes in the branches being merged, Git
performs a three-way merge. In this case, Git creates a new merge commit that contains
both sets of changes, and any conflicts must be manually resolved.
26. What is conflict? OR When do we get conflict?
conflict occurs when two or more branches have made changes to the same lines of code or
file, and Git is unable to automatically merge the changes together. This can happen when
multiple developers are working on the same codebase, and both make changes to the same
file or code block.
When Git encounters a conflict, it stops the merge process and asks the user to resolve the
conflict manually. Git highlights the conflicting lines of code and provides options to accept
one change or the other, or to manually edit the code to create a new version that
incorporates both changes.
Conflicts can occur during a merge or a rebase operation. During a merge, conflicts occur
when Git is unable to automatically merge changes from two branches. During a rebase,
conflicts can occur when Git tries to apply changes from a branch on top of changes from
another branch.
Conflicts can also occur when multiple developers make changes to the same file at the
same time, either intentionally or unintentionally. To avoid conflicts, developers can
communicate with each other and coordinate their work, or use branching strategies that
minimize the risk of conflicts.
27. What is fast-forward merge in Git?
fast-forward merge is a simple and linear way to integrate changes from one branch into
another. It can happen automatically when a branch is merged into the master or main
branch, for example, after the changes in the feature branch have been completed and
tested.
Here's an example scenario of a fast-forward merge:
You create a new branch called feature-branch from the master branch.
You make changes and commit them to the feature-branch.
Meanwhile, no other changes have been made to the master branch.
You merge the feature-branch back into the master branch using a fast-forward merge.
Git simply moves the master branch pointer forward to the latest commit on the feature-
branch, integrating the changes into the master branch.
Fast-forward merges are generally safe and easy to perform, but they are only possible
when the branches being merged have a linear history and do not contain any conflicting
changes. If there are conflicts between the branches, Git will not be able to perform a fast-
forward merge and will require a more complex merge process.
28. What is the difference between Merge and Rebase?Merging combines the changes from one branch into another by creating a new merge
commit. This creates a new commit that has two parent commits, representing the two
branches being merged. Merging is a simple way to integrate changes and is often used in
scenarios where multiple developers are working on different features or bug fixes.
Rebasing, on the other hand, applies the changes from one branch onto another by moving
the entire branch to a new base commit. This creates a linear history of changes and
eliminates the need for merge commits. Rebasing is often used to keep a clean and linear
commit history, especially when working with long-running branches.
Here are some differences between merge and rebase:
Commit History: Merging creates a new merge commit that has two parent commits,
representing the two branches being merged. Rebasing, on the other hand, rewrites the
commit history and creates a linear history of changes.
Conflict Resolution: Merging allows Git to automatically resolve conflicts between the two
branches being merged, but if there are conflicts, it creates a merge commit that must be
resolved manually. Rebasing, on the other hand, requires manual conflict resolution for each
commit that is rebased.
Branch Preservation: Merging preserves the existing branches and their commit histories.
Rebasing, on the other hand, moves the entire branch to a new base commit, effectively
rewriting the branch history.
Collaboration: Merging is often used in scenarios where multiple developers are working
on different features or bug fixes. Rebasing is often used to keep a clean and linear commit
history, especially when working with long-running branches.
29. How do you resolve the conflict in Git?
Identify the conflict: Git will identify the conflicting files and show the changes that are in
conflict.
Open the conflicting file: Open the file that has a conflict in a text editor.
Resolve the conflict: Identify the conflicting lines of code and manually edit the file to
create a new version that incorporates both changes. You can either accept one change or
the other, or edit the code to create a new version that incorporates both changes.
Save the changes: Save the edited file.
Mark the file as resolved: After you've resolved the conflict, mark the file as resolved using
the git add command.
Commit the changes: After marking the file as resolved, commit the changes using the git
commit command with a message explaining the changes.
Continue the merge: After resolving the conflict, continue the merge process using the git
merge --continue command.It's important to carefully review the changes after resolving the conflict to ensure that the
code is working as expected and that the changes have been integrated correctly into the
codebase.
If there are still conflicts after resolving the initial conflicts, repeat the steps until all conflicts
are resolved. If you're having difficulty resolving a conflict, you can consult with your team or
seek help from experienced Git users.
30. What kind of conflicts you have seen?
Content Conflict: This is the most common type of conflict and occurs when changes have
been made to the same lines of code in both the source and target branches. Git will
highlight the conflicting lines of code and ask the user to resolve the conflict manually.
Rename/Deletion Conflict: This occurs when one branch renames or deletes a file that has
been modified in another branch. Git will show a conflict error indicating that the file has
been deleted in one branch and modified in another, and the user will need to resolve the
conflict manually.
Binary Conflict: This occurs when Git encounters a file that it doesn't know how to merge
automatically, such as an image or video file. Git will ask the user to resolve the conflict
manually.
Structural Conflict: This occurs when changes are made to the file structure, such as
renaming or moving files or folders. Git will show a conflict error indicating that the file or
folder has been moved or renamed in one branch and modified in another, and the user will
need to resolve the conflict manually.
Submodule Conflict: This occurs when a submodule has been modified in one branch and
not in another. Git will ask the user to update the submodule and resolve the conflict
manually.
It's important to be familiar with these types of conflicts and know how to resolve them
manually in Git. Resolving conflicts properly ensures hat the codebase is maintained in a
stable and reliable state.
31. Who resolves the conflicts?
In Git, conflicts can be resolved by anyone who has access to the codebase, but typically it is
the responsibility of the developers who are working on the affected branches to resolve
conflicts that arise.
If a conflict arises between two branches that are being worked on by different developers,
it is important to communicate and collaborate to resolve the conflict. This may involve
discussing the changes that were made to each branch and finding a way to merge the
changes in a way that does not break the code or introduce bugs.
In some cases, conflicts may need to be escalated to a more senior developer or a project
manager who can help to resolve the conflict or make a decision about how to proceed.
Ultimately, it is important to work together to resolve conflicts quickly and efficiently in
order to maintain a stable and reliable codebase.32. What is the difference between branch and tag?
A branch is a separate line of development that allows multiple developers to work on the
same codebase simultaneously. Each branch represents a different version of the codebase
that may have its own features, bug fixes, or changes. Developers can create a new branch
to work on a specific feature or bug fix and merge their changes back into the main branch
when they are ready.
A tag, on the other hand, is a marker that identifies a specific point in the codebase's history.
Tags are typically used to mark significant milestones, such as a major release, a stable
version, or a significant change in the codebase. Unlike branches, tags do not represent a
separate line of development, and they cannot be modified or updated once they have been
created.
In summary, branches are used to manage separate lines of development, while tags are
used to mark specific points in the codebase's history. Both branches and tags are important
tools in Git for managing and organizing a codebase's history and different versions.
33. When do you create a branch and tag?
Branches and tags are used in version control systems to manage different versions of a
codebase. Here's when you might create a branch and a tag:
Creating a branch: You might create a branch when you want to work on a new feature or
fix a bug without affecting the main codebase. This allows you to experiment with changes
and collaborate with others without disrupting the main codebase. Once the changes in the
branch are complete, they can be merged back into the main codebase.
Creating a tag: You might create a tag when you want to mark a specific version of the
codebase. Tags are often used to mark important milestones, such as major releases or
production deployments. They allow you to easily reference and track specific versions of
the codebase.
It's important to note that branches and tags serve different purposes. Branches are used for
ongoing development and collaboration, while tags are used for marking specific versions of
the codebase.
34. How do you create a branch and switch to that using single command?
git checkout -b <branch-name>
This command creates a new branch with the specified name and immediately switches to
it. For example, if you wanted to create a new branch called "my-feature-branch" and switch
to it, you would run
git checkout -b my-feature-branch
35. What is HEAD pointer in Git? Where Git store HEAD info.
The HEAD pointer can be thought of as a marker or pointer that indicates the current
position within the Git commit history.
The HEAD pointer can be used to perform various operations in Git, such as creating a new
branch from the current commit, resetting the repository to a previous commit, or checking
the status of the repository.The HEAD pointer is stored in a file called .git/HEAD in your Git repository. This file contains
the reference to the current branch or commit that HEAD is pointing to.
When you create a new branch or commit in Git, the HEAD pointer is updated to reflect the
new position in the commit history. You can also manually change the position of HEAD by
using Git commands such as git checkout, git reset, or git merge.
It's important to note that the HEAD pointer is a local reference that is specific to your local
Git repository. When you push your changes to a remote repository, the remote repository
will have its own HEAD pointer that may be different from your local HEAD pointer.
36. Can we store binary files in Git?
Yes, it is possible to store binary files in Git. Git is designed to handle all kinds of files,
including text files, images, audio files, and other binary files. However, it's important to
note that Git is optimized for storing text files and may not perform as well with very large
binary files.
When you add a binary file to a Git repository, Git will treat it as a binary file and store it in
its internal object database. Git uses a binary diff algorithm to track changes in binary files,
which means that it can efficiently store and retrieve versions of binary files over time.
37. Can skip the staging? How?
Yes, it is possible to skip the staging area and directly commit changes to your Git repository
using the git commit command with the -a or --all option.
The -a or --all option tells Git to automatically stage all modified and deleted files before
creating the commit. Here's an example:
git commit -a -m "Commit message"
38. How do you list files/folders modified as part of a commit?
To list the files and folders that were modified as part of a specific commit in Git, you can
use the git diff command with the commit hash of the previous commit and the commit
hash of the current commit. Here's an example:
git diff --name-only <previous-commit-hash> <current-commit-hash>
This command will list the names of all the files that were modified between the previous
commit and the current commit, separated by line breaks. If you want to see the full paths
of the files instead of just the file names, you can use the --name-status option instead of --
name-only
39. What is git revert?
git revert is a Git command that creates a new commit that undoes the changes made in a
previous commit. The git revert command can be used to revert a single commit or a range
of commits.
When you run git revert, Git will create a new commit that contains the opposite of the
changes made in the commit(s) you specify. This means that the changes made in the
original commit(s) are not lost and can still be accessed in the Git history. The new commit
created by git revert essentially undoes the changes made by the original commit(s) without
deleting them from the Git history.
The syntax for using git revert is as follows:git revert <commit>
Here, <commit> refers to the hash of the commit you want to revert. You can also revert a
range of commits by specifying a range of commit hashes.
For example, if you want to revert the changes made in commit abcdefg, you can run the
following command:
git revert abcdefg
This will create a new commit that undoes the changes made in the abcdefg commit. The
new commit will contain the opposite changes and will have a commit message that
indicates it is a revert.
It's important to note that git revert does not modify the original commit(s) or the Git
history in any way. Instead, it creates a new commit that undoes the changes made in the
original commit(s). This means that if you later decide you want to reintroduce the changes,
you can do so by reverting the revert commit.
40. How do you add ignore list for all users?
To add a global ignore list for all users on a Git installation, you can create a .gitignore_global
file in the root directory of your Git installation and add the files and patterns you want to
ignore to this file. The .gitignore_global file works the same way as the .gitignore file, but its
rules apply globally to all repositories on the Git installation.
Here's how you can create and add rules to the global ignore file:
Open a terminal or command prompt and navigate to the root directory of your Git
installation.
Create a .gitignore_global file in the root directory using a text editor or the command
line:
touch ~/.gitignore_global
Open the .gitignore_global file in a text editor.
Add the files and patterns you want to ignore to the file, one per line. For example:
# Ignore .DS_Store files on Mac
.DS_Store
# Ignore .log files
*.log
Save and close the file.
Once you have created the global ignore file and added the rules you want, you need to tell
Git to use it as the global ignore file. You can do this by running the following command in
your terminal or command prompt:
git config --global core.excludesfile ~/.gitignore_global
This command tells Git to use the .gitignore_global file in your home directory as the global
ignore file for all repositories on your Git installation. From now on, any files or patterns you
add to the .gitignore_global file will be ignored by Git in all repositories.
41. What are the different files you ignore in your project?The files that are typically ignored by version control systems are usually listed in a file called
".gitignore" or a similar configuration file. Here are some examples of files that are
commonly ignored:
Compiled binary files: These are the files generated by a compiler when you build your
code. They're often platform-specific, and you don't need them in version control because
you can always regenerate them. Examples include .exe, .o, and .dll files.
Temporary files: These are files created by the operating system or your development
environment that you don't need to keep track of. Examples include .tmp, .swp, and .bak
files.
Dependency files: These are files generated by dependency management tools like npm or
pip. They're often specific to your local environment and don't need to be versioned.
Examples include node_modules and virtualenv directories.
Configuration files: These are files that contain sensitive information or that are specific to
a particular environment. Examples include .env files, database configuration files, and local
settings files.
Log files: These are files that contain debugging or error messages generated by your
application. They can get very large and aren't usually useful to keep track of in version
control.
User-specific files: These are files that contain user preferences or other user-specific data
that shouldn't be shared between users. Examples include .DS_Store files on macOS and
.vscode directories.
It's important to have a well-configured .gitignore file to ensure that you're not committing
unnecessary files to your version control system.
42. How to remove a committed change? Or can we remove?
Yes, it is possible to remove a committed change, but it requires some additional steps and
careful consideration because changing the commit history can cause problems for
collaborators who have already based their work on the existing commit history.
There are two main ways to remove a committed change:
Revert: You can create a new commit that undoes the changes made by a previous
commit. This is called a revert commit, and it's the safest way to remove a committed
change because it preserves the commit history. To create a revert commit, you can use the
git revert command followed by the hash of the commit you want to revert.
For example, if you want to revert the commit with the hash abc123, you can use the
following command:
git revert abc123
This will open an editor for you to add a commit message explaining the reason for the
revert. Once you save and close the editor, Git will create a new commit that undoes the
changes made by the original commit.Reset: You can use the git reset command to remove a committed change by moving the
branch pointer back to an earlier commit. This is a more drastic approach because it
removes the commit history, including any changes made in subsequent commits. It's
generally not recommended to use git reset to remove changes from a public branch that
other collaborators are working on.
If you're sure that you want to remove a committed change and you're working on a branch
that's only visible to you, you can use the git reset command followed by the hash of the
commit you want to reset to.
For example, if you want to reset to the commit with the hash def456, you can use the
following command:
git reset def456
This will remove the commit history after def456 and leave the changes in the working
directory. You can then make additional changes and create a new commit with the
corrected changes.
43. How do you lock the branch?
In Git, you can "lock" a branch in order to prevent accidental changes or to restrict access to
certain team members. This can be useful in situations where you want to ensure that a
certain version of your codebase remains stable and unchanged for a period of time.
There are different ways to implement branch locking depending on the Git hosting platform
you're using, but I'll describe some common methods below:
Protected branches: Git hosting platforms like GitHub and GitLab offer a feature called
"protected branches" that allows you to restrict who can push changes to a particular
branch. You can configure a protected branch to require certain criteria to be met before
changes can be merged, such as requiring a code review or passing a continuous integration
(CI) build.
Branch permissions: Some Git hosting platforms, like Bitbucket, allow you to set branch
permissions that restrict who can push changes to a branch. You can specify which users or
groups have read, write, or admin access to a branch.
Git hooks: Git hooks are scripts that can be run automatically when certain Git events
occur, such as a commit or push. You can use a pre-receive hook to prevent changes from
being pushed to a particular branch, effectively locking the branch. This method requires
more technical knowledge and is generally not recommended for non-technical team
members.
It's important to carefully consider who should have access to locked branches and to
communicate the locking policy clearly to the team. It's also a good idea to periodically
review branch locks to ensure that they're still necessary and to adjust permissions as
needed.44. How do you clone the particular branch?
To clone a specific branch from a remote repository, you can use the following command in
your terminal or command prompt:
git clone -b branch_name remote_repository_url
Replace branch_name with the name of the branch you want to clone, and
remote_repository_url with the URL of the remote repository.
For example, if you want to clone the develop branch from the
git@github.com:user/repo.git remote repository, you can use the following command:
git clone -b develop git@github.com:user/repo.git
This will create a local copy of the develop branch in a new directory with the same name as
the remote repository. You can then navigate into the directory and work with the files in
that branch.
45. How do you restore a deleted file? Or previous changes of a file?
If you have deleted a file or made changes to a file and want to restore it to a previous state,
you can use Git to recover the file or the previous version of the file. Here are the steps you
can follow:
git status
This will show you the current state of your repository and the changes you have made.
If you have deleted a file, you can use the following command to restore it:
git checkout -- path/to/file
Replace path/to/file with the path to the deleted file. This will restore the file to its previous
state and add it back to your repository.
If you have made changes to a file and want to restore it to a previous version, you can use
the following command:
git checkout commit_hash path/to/file
Replace commit_hash with the hash of the commit that contains the previous version of the
file. You can find the commit hash using the command git log. Replace path/to/file with the
path to the file you want to restore.
46. How do you list the diff. of a file between two different branches.
To list the difference between a file in two different branches, you can use the git diff
command with the branch names and the path to the file you want to compare. Here are
the steps you can follow:
First, make sure you have the latest versions of the branches you want to compare. You
can do this by running the following commands:
git fetch
git checkout branch1
git pull
git checkout branch2
git pull
Replace branch1 and branch2 with the names of the branches you want to compare.
Once you have the latest versions of both branches, use the following command to list the
difference between the two branches for the file:
git diff branch1..branch2 -- path/to/fileReplace branch1 and branch2 with the names of the branches you want to compare.
Replace path/to/file with the path to the file you want to compare.
This command will list the difference between the file in the two branches. The lines that
are different between the two branches will be highlighted with a - symbol for lines removed
in branch1 and a + symbol for lines added in branch2.
Note: The .. syntax is used to specify the range of commits to compare. In this case, it is used
to compare the difference between branch1 and branch2.
47. How do you list the changes which are going to be fetched?
To list the changes that are going to be fetched from a remote repository, you can use the
git fetch command with the -v flag, which stands for verbose. Here are the steps you can
follow:
Open your terminal or command prompt and navigate to your local repository.
Run the following command to fetch changes from the remote repository:
git fetch –v
The -v flag will show the progress and the list of changes that are being fetched.
After the command completes, you can use the git log command to view the list of changes
that were fetched. For example, to view the changes that were fetched for the master
branch, you can run the following command:
git log FETCH_HEAD..master
This command will show the list of commits that were fetched for the master branch. You
can replace master with the name of the branch you want to view the changes for.
Note that FETCH_HEAD is a reference that points to the latest commit that was fetched from
the remote repository. You can use this reference to compare the changes between the local
and remote repositories.
48. What is Git Stash?
Git stash is a command used in the Git version control system to temporarily save changes
that are not yet ready to be committed. When working on a project, you may make changes
to files that you don't want to commit yet, but also don't want to discard. This is where Git
stash comes in handy.
Using Git stash, you can save your changes to a "stash" - a data structure that Git uses to
keep track of changes that are not committed yet. The stash includes the changes you made
to tracked files, as well as any new files you added to the repository.
Once you have saved your changes to the stash, you can continue working on your project as
if the changes never existed. Later on, when you're ready to work on the changes again, you
can retrieve them from the stash and apply them to your current working directory.
The Git stash command has several subcommands that allow you to manage your stashes.
For example, you can list all stashes, apply a specific stash, or delete a stash once you no
longer need it.49. How do you add a new remote to git? Or How do you attach your local repo with
remote?
To add a new remote to Git, you can use the following command:
git remote add <remote-name> <remote-url>
Where <remote-name> is the name you want to give to the remote, and <remote-url> is the
URL of the remote repository you want to connect to.
For example, if you want to connect your local Git repository with a remote repository
hosted on GitHub, you can use the following command:
git remote add origin https://github.com/<username>/<repository-name>.git
This command will add a new remote named "origin" and connect it to the GitHub
repository with the URL specified.
Once you have added the remote, you can push your changes to it using the git push
command. For example, to push your local changes to the remote repository, you can use:
git push origin master
This command will push the changes in your local "master" branch to the "master" branch
on the remote repository named "origin".
Alternatively, if you have already created a remote repository on GitHub, you can clone it to
your local machine using the git clone command. This will automatically set up the remote
connection for you.
git clone https://github.com/<username>/<repository-name>.git
This command will clone the remote repository to your local machine and create a new Git
repository with the same name as the remote repository.
50. What is git ls-tree?
git ls-tree is a Git command that displays the contents of a Git repository tree object. A Git
repository consists of a series of snapshots of the state of the repository at various points in
time. Each snapshot is represented by a tree object, which contains a list of files and
subdirectories along with their metadata, such as file mode, type, and hash.
The git ls-tree command allows you to view the contents of a particular tree object. It takes
one or more arguments that identify the tree object(s) you want to display, along with
optional options. The most common usage is to specify a Git object hash or branch name
followed by a path, like so:
git ls-tree <branch-or-hash> <path>
For example, to view the contents of the root directory of the current branch, you can run:
git ls-tree HEAD
This will display a list of files and subdirectories in the root directory along with their
metadata, such as file mode and hash.
51. What is git cherry-pick?
git cherry-pick is a Git command that allows you to apply a commit from one branch to
another. This is useful when you want to incorporate a change made in one branch into
another branch without merging the entire branch.The git cherry-pick command takes a commit ID as an argument and applies the changes
made in that commit to the current branch. This creates a new commit with the same
changes as the original commit, but with a new commit ID and commit message.
Here's an example of how to use git cherry-pick:
Switch to the branch you want to apply the commit to:
git checkout target-branch
Determine the commit ID of the commit you want to apply:
git log
Use the git cherry-pick command to apply the commit:
git cherry-pick <commit-id>
Replace <commit-id> with the actual commit ID.
Resolve any conflicts that arise during the cherry-pick process.
Commit the changes:
git commit
This creates a new commit with the changes from the original commit applied to the current
branch. Note that git cherry-pick applies the changes from a single commit, so if you want to
apply multiple commits, you need to run the command multiple times.
52. What is git fork?
Git fork is a feature of the Git version control system that allows you to create a copy of a
repository (either your own or someone else's) into your own account or organization.
When you fork a repository, you get your own copy of the codebase that you can modify,
experiment with, and contribute changes back to the original repository.
Forking is commonly used in open-source software development, where developers want to
contribute changes to a project but do not have direct access to the original repository. By
forking the repository, they can make changes to their own copy and submit a pull request
to the original repository, which the project maintainers can review and merge if they
approve.
When you fork a repository, you create a new repository that is linked to the original
repository. This means that you can pull changes from the original repository into your fork,
as well as push changes from your fork back to the original repository. This allows for
collaborative development and ensures that changes made in one repository can be easily
shared and merged into another.
53. What is git squash ?
Git squash is a technique in Git version control system used to combine multiple commits
into a single commit. This is typically done to simplify the commit history and make it easier
to understand, especially when working on a team or contributing to an open-source
project.
When you squash commits, you are essentially taking multiple small, related commits and
merging them into a larger, more coherent commit. This can make the commit history morereadable and easier to understand, as it reduces the number of commits and removes
unnecessary details that may not be relevant to the overall development process.
To squash commits, you use the "git rebase" command with the "interactive" flag. This
opens an interactive rebase session, where you can choose which commits to squash, edit
commit messages, and rearrange the order of the commits. Once you have made your
changes, you save and exit the interactive rebase session, and Git will automatically rewrite
the commit history to reflect your changes.
It is important to note that squashing commits can alter the commit history and make it
more difficult to track down specific changes or bugs, so it is important to use this technique
carefully and only when necessary. It is also important to communicate with other
developers or team members before squashing commits, to ensure that everyone is on the
same page and understands the changes being made.
54. what is difference between git fetch, pull and clone?
Git clone: This command is used to create a copy of a remote repository onto your local
machine. When you clone a repository, you create a local copy of the entire repository,
including all its branches and history.
Syntax: git clone <remote_repository_url>
Git fetch: This command is used to update your local repository with changes made in the
remote repository. It downloads the changes to your local repository but does not
automatically merge them with your working copy.
Syntax: git fetch
Git pull: This command is used to update your local repository with changes made in the
remote repository and merge them with your working copy. It performs a "fetch" followed
by a "merge" of the changes into your current branch.
55. What are Git Hooks?
Git Hooks are scripts or programs that are executed automatically by Git at certain points in
the Git workflow. They are customizable and allow you to automate tasks, enforce coding
standards, and perform other operations before or after specific Git commands.
There are two types of Git Hooks: client-side hooks and server-side hooks.
Client-side hooks: These are executed on the developer's local machine, and are used to
enforce local policies. For example, a pre-commit hook could be used to ensure that all tests
pass before allowing a commit.
Common client-side hooks include:
pre-commit: Runs before a commit is made and can be used to ensure that the code being
committed meets certain criteria.
post-commit: Runs after a commit is made and can be used to perform actions such as
sending notifications or generating documentation.Server-side hooks: These are executed on the server where the Git repository is hosted,
and are used to enforce project-wide policies. For example, a pre-receive hook could be
used to prevent certain branches from being pushed to.
Common server-side hooks include:
pre-receive: Runs before a push is accepted and can be used to enforce policies such as
ensuring that certain files are not pushed or that the code being pushed meets certain
criteria.
post-receive: Runs after a push is accepted and can be used to perform actions such as
triggering a build or updating a deployment.
Git Hooks are highly customizable and can be used to automate many different tasks in the
Git workflow. They can be written in any programming language and stored in the .git/hooks
directory of the Git repository.
56. What are Git TAGs ?
In Git, a tag is a label or a reference that you can apply to a specific commit in your Git
repository. It is commonly used to mark specific points in your repository's history, such as a
release, a stable version or a major milestone.
Git tags are essentially pointers to specific commits in the repository, allowing you to easily
reference and retrieve them later. Tags can be created at any point in the repository's
history and can be applied to a specific commit, a branch or a range of commits.
Git tags come in two types: lightweight tags and annotated tags.
Lightweight tags: Lightweight tags are simple pointers to specific commits and contain
only the commit hash and tag name.
Annotated tags: Annotated tags are more detailed and contain additional information
such as the tagger's name and email, the date and time the tag was created, and an optional
message describing the tag. Annotated tags can also be signed with a GPG key to provide an
additional layer of security.
57. What is Git alias?
In Git, an alias is a custom command or shortcut that you can create to simplify your Git
workflow. An alias is essentially a shorthand for a longer Git command, making it easier to
type and remember.
Creating a Git alias involves defining a new command that will execute a series of Git
commands or options. For example, instead of typing "git status", you could create an alias
called "s" that is equivalent to "git status".
You can define Git aliases at both the system level (global) and the repository level. Global
aliases are available to all repositories on your machine, while repository-level aliases are
specific to a particular repository.
To create a Git alias, you can use the git config command with the --global option to set a
global alias, or without the --global option to set a repository-level alias. The syntax for
defining an alias is:git config [--global] alias.<alias-name> <git-command>
58. What is Git gc?
git gc stands for Git Garbage Collector. It is a Git command that performs housekeeping
tasks to optimize the performance and reduce the size of your Git repository.
When you use Git, the repository can become cluttered with various objects, such as
commits, trees, and blobs, that are no longer needed. Over time, these objects can
accumulate and slow down Git's performance and increase the size of the repository.
git gc helps to clean up these unnecessary objects and optimize the repository by performing
several tasks, including:
Packing loose objects into pack files: Git stores objects in loose format, which can be
inefficient for performance and storage. git gc packs these loose objects into a compressed
pack file to reduce the size of the repository.
Compressing pack files: Git compresses pack files to reduce their size and improve
performance.
Removing unreachable objects: Git removes any objects that are no longer needed, such
as orphaned commits, to reduce the size of the repository.
59. What is git gc --aggressive?
git gc --aggressive is a command that runs the Git garbage collector (gc) in aggressive mode,
which can help to further optimize the size and performance of your Git repository.
When you run git gc without any options, Git runs the garbage collector in default mode,
which performs a basic cleanup of the repository. However, running git gc --aggressive
instructs Git to perform additional optimizations, such as:
Expanding the delta chains: Delta compression is used by Git to store changes as the
difference between two similar objects. By expanding the delta chains, Git can better
compress and reduce the size of the repository.
Reordering pack files: Git stores objects in pack files, which can become inefficient if they
are not ordered correctly. By reordering the pack files, Git can improve the performance and
reduce the size of the repository.
Optimizing object repacking: Git repacks objects during the garbage collection process to
reduce the size of the repository. By optimizing this process, Git can further reduce the size
and improve the performance of the repository.
60. What inside .git folder?
The .git folder is the heart of a Git repository and contains all the information necessary to
track changes to your files and collaborate with others. Here are some of the most
important files and directories inside the .git folder:
HEAD: A pointer to the current branch you're on.refs: A directory that contains references to different objects in the repository, such as
branches, tags, and remotes.
objects: A directory that contains all the Git objects, which include the data that
represents your files and directories, as well as the metadata associated with each object.
config: A file that contains configuration settings for the repository, such as user name and
email.
hooks: A directory that contains scripts that can be run before or after certain Git events,
such as committing or pushing changes.
index: A file that serves as the staging area for changes to be committed.
logs: A directory that contains the history of all Git operations performed on the
repository.
branches: A directory that contains pointers to the tip of each branch in the repository.
config: A file that contains the local configuration for the repository.
description: A file that is used by Git hosting services to provide information about the
repository.
61. What is a bare Git repository?
A bare Git repository is a repository that does not have a working directory. Unlike a regular
Git repository, which has a working directory where you can edit and view the files in your
project, a bare repository only contains the Git database, including the object database and
the refs.
A bare repository is typically used as a central repository in a Git workflow where multiple
developers collaborate on a project. In this workflow, each developer has their own clone of
the repository with a working directory where they can edit and view files. When changes
are made and pushed to the central bare repository, other developers can fetch those
changes and merge them into their local clones.
Because a bare repository does not have a working directory, it can be faster and more
efficient than a regular repository. It also eliminates the possibility of conflicts between the
files in the working directory and the repository data. However, you cannot directly view or
edit the files in a bare repository, and it is generally not recommended to use it as a clone
for local development.
You can create a bare repository using the git init --bare command.
62. What is a Git Remote Repository?
A Git remote repository is a Git repository that is hosted on a remote server or service,
rather than on your local machine. It allows multiple developers to collaborate on a project
by providing a centralized location to share and manage changes to the codebase.
When you clone a remote repository to your local machine, Git creates a local copy of the
remote repository, including all of its branches, tags, and history. You can then make
changes to the code locally and push those changes back to the remote repository to share
them with others.
Git supports multiple protocols for connecting to remote repositories, including HTTPS, SSH,
and Git-specific protocols like git:// and ssh://. Some popular hosting services for remote Git
repositories include GitHub, GitLab, and Bitbucket.To work with a remote repository in Git, you typically use commands like git clone to create
a local copy, git fetch to download the latest changes from the remote, git push to upload
your changes to the remote, and git pull to download and merge changes from the remote
into your local repository.
63. What is the Working Tree in Git?
In Git, the working tree is the directory in your local machine where you have checked out a
version of your project's source code. It represents the current state of your codebase,
including any changes that you have made since the last commit.
When you make changes to files in the working tree, Git detects the changes and tracks
them as modifications to the files. These changes can then be staged and committed to the
Git repository using the git add and git commit commands.
The working tree is an essential part of Git's version control system, as it allows you to make
changes to your project and track those changes over time. It also allows you to switch
between different versions of your codebase by checking out different branches or commits,
which updates the contents of the working tree to reflect the chosen version.
64. Roles and Responsibility in GIT ?
Developers: Developers are responsible for creating and modifying code, committing
changes to their local repository, and pushing those changes to the central Git repository.
They are expected to follow the project's coding standards and guidelines and to ensure that
their changes are well-tested and do not introduce bugs or regressions.
Maintainers: Maintainers are responsible for reviewing and merging changes from
developers into the mainline codebase. They are typically more experienced developers who
have a deep understanding of the project's architecture and codebase. They may also be
responsible for managing the project's Git repository, including setting up and enforcing
access control and branch management policies.
Release Managers: Release managers are responsible for managing the release process for
the project. This includes coordinating with developers and maintainers to ensure that all
changes are tested and ready for release, creating and testing release builds, and publishing
releases to the appropriate distribution channels.
Operations Team: The operations team is responsible for deploying and maintaining the
project in a production environment. They may work closely with developers and release
managers to ensure that the production environment is properly configured, tested, and
monitored, and that any issues or bugs are quickly resolved.
65. Which port is used by git?
Git uses the default port 9418 for the Git protocol, which is a read-only protocol used for
fetching Git repositories. However, for secure access, Git can also use the SSH protocol,
which uses port 22 by default, or the HTTPS protocol, which uses port 443 by default.
If you are using a custom protocol or a different port, you can specify it in the repository URL
or in your Git configuration. For example, to use a custom port 1234, you can specify the
repository URL like this:git clone git://example.com:1234/myrepo.git
Or, to set a custom port as the default for a specific Git repository, you can edit the
.git/config file in the repository and add a configuration like this:
[remote "origin"]
url = git://example.com/myrepo.git
fetch = +refs/heads/*:refs/remotes/origin/*
port = 1234
Note that you may need to configure your firewall or network settings to allow traffic on the
specified port for Git to work properly.
66. How to check all remote branches and how to get in locally ?
To check all remote branches in Git, you can use the git branch command with the -r option,
which shows all the remote-tracking branches. To get a list of all the remote branches in the
repository,
git branch –r
This will list all the remote branches in the repository, prefixed with the name of the remote
they are associated with (usually "origin").
To get a local copy of a remote branch, you can use the git checkout command with the
branch name. For example, to get a local copy of the remote branch "feature-branch", run:
git checkout feature-branch
This will create a new local branch called "feature-branch" that tracks the remote branch
with the same name. You can then make changes to the branch and commit them locally,
and push them back to the remote branch using the git push command.
67. How to merge two repositories in one repositories using command line. ?
To merge two Git repositories into one using the command line, you can follow these
general steps:
Create a new Git repository that will serve as the merged repository. You can use the git
init command to create an empty repository:
$ mkdir merged-repo
$ cd merged-repo
$ git init
Add the two existing repositories as remote repositories to the merged repository. You
can use the git remote add command to add a remote repository:
$ git remote add repo1 <path/to/repo1>
$ git remote add repo2 <path/to/repo2>
Replace <path/to/repo1> and <path/to/repo2> with the paths to the two repositories you
want to merge.
Fetch the branches and history from the two remote repositories using the git fetch
command:$ git fetch repo1
$ git fetch repo2
Merge the branches from the two remote repositories into the master branch of the
merged repository using the git merge command. For example, to merge the master
branches from the two remote repositories, run:
$ git merge repo1/master
$ git merge repo2/master
Resolve any merge conflicts that arise during the merge process.
Commit the changes to the merged repository using the git commit command.
$ git commit -m "Merged repo1 and repo2 into merged-repo"
Push the changes to the merged repository back to a remote repository or a Git hosting
service like GitHub, GitLab, or Bitbucket using the git push command.
$ git push origin master
68. what is git bi-sect
The git bisect command works by performing a binary search on the commit history of the
codebase. You start by marking a known good commit and a known bad commit, and Git will
check out the commit halfway between them. You can then test whether the bug is present
in this commit, and mark it as either good or bad. Git will then check out the commit halfway
between the last marked commit and the one before it, and the process repeats until Git has
found the exact commit that introduced the bug.
To use git bisect, you can follow these general steps:
Start the bisect process by running git bisect start command.
Mark a known good commit using the git bisect good <commit> command. For example,
you can use the commit hash of the last known good version of the codebase.
Mark a known bad commit using the git bisect bad <commit> command. For example, you
can use the commit hash of the first known bad version of the codebase.
Git will check out a commit halfway between the two marked commits. Test whether the
bug is present in this commit, and mark it as either good or bad using the git bisect good or
git bisect bad command, respectively.
Git will check out the next commit halfway between the last marked commit and the one
before it, and the process repeats until Git has found the exact commit that introduced the
bug.
Once Git has found the commit that introduced the bug, you can use git bisect reset
command to return to the branch you were previously on.69. what is git blob ?
In Git, a blob is a binary large object that represents the contents of a file. A blob stores the
contents of a file in a compressed and binary format, and is identified by a unique SHA-1
hash.
Git uses blobs to represent the contents of files that are tracked in a repository. Each time
you make a change to a file in a Git repository and commit the change, Git creates a new
blob object that represents the contents of the file at that point in time. Blobs are used to
store the contents of all types of files, including text files, binary files, images, and more.
Blobs are stored in the .git/objects directory of a Git repository. Blobs are compressed and
stored as individual files with names that correspond to their SHA-1 hashes. When you
checkout a file from a Git repository, Git reads the blob that represents the file's contents
from the .git/objects directory and writes the file's contents to your working directory.
Although you can't directly manipulate blobs in Git, understanding how Git uses blobs to
store and version file contents can help you understand how Git works under the hood.
70. what is git blame ?
git blame is a command in Git that allows you to see who made changes to each line of a file
and when those changes were made. It is a useful tool for understanding the history of
changes to a file and can help with debugging, code review, and collaboration.
When you run git blame on a file, Git shows you each line of the file and the commit hash,
author, and timestamp of the last change made to that line. You can use the -L option to
specify a range of lines to show. By default, Git shows the entire file.
The output of git blame also includes the commit message and hash for each change, so you
can see why the change was made and which other changes it might be related to. You can
use the -M option to detect changes that were moved from one file to another.
git blame can be especially useful when you're trying to understand the history of a file or
track down a bug that was introduced in a specific change. By examining the changes made
to each line, you can often identify the commit that introduced the bug and use other Git
commands, like git bisect, to track down the source of the problem.
71. what git web-hooks ?
Git webhooks are a feature of Git that allow you to configure your repository to send HTTP
requests to a web server whenever certain events occur, such as a new commit being
pushed to the repository, a pull request being opened or closed, or a tag being created.
These HTTP requests can trigger scripts or other actions on the web server, such as running
tests, deploying code, or sending notifications.
Webhooks can be used to automate various tasks in the development workflow, such as
automatically building and deploying code to a staging or production environment when a
new commit is pushed to the repository. Webhooks can also be used to integrate Git with
other tools and services, such as continuous integration and delivery (CI/CD) tools, issue
trackers, chat applications, and more.To set up a webhook in Git, you need to create a web server that can receive HTTP requests
and configure your repository to send those requests to the correct URL. You can create a
webhook in your repository settings in the web-based interface of your Git hosting provider,
or you can create a webhook programmatically using the Git API.
Once a webhook is set up, Git will automatically send HTTP requests to the configured URL
whenever the specified event occurs, allowing you to automate various tasks and integrate
Git with other tools and services.
