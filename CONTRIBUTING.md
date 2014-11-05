# How to contribute

We want to keep it as easy as possible to contribute changes to support
the growth and stability of Eac. There are a few guidelines that we
need contributors to follow so that we can have a chance of keeping on
top of things.

## Getting Started

### Reporting an Issue

Enders Aerial Cast crashing, have a suggestion, found a bug?  Create an issue now!

1. Make sure your issue hasn't already been answered or fixed.  Also think about whether your issue is a valid one before submitting it.
2. Go to [the issues page](https://github.com/EacMods/Eac/issues)
3. Click new issue
4. Enter your Issue's title (something that summarizes your issue), and then create a detailed description of the issue.
	* To help in resolving your issues please try to include the follow if applicable:
		* The problem that is happening?
		* What was expected?
		* How to reproduce the problem?
		* Server or Single Player?
		* Mod Pack using and version?
		* Crash log (Please make sure to use [pastebin](http://pastebin.com/) for the log file) 
		* Screen shots or Pictures of the problem
5. Click `Submit New Issue`, and wait for feedback!

### Submitting Changes

* Submit an issue to the github project, assuming one does not already exist.
  * Clearly describe the issue including steps to reproduce when it is a bug.
  * Make sure you fill in the earliest version that you know has the issue.
* Fork the repository on GitHub
* Create a topic branch from where you want to base your work.
  * This is revison branch that is under active development.
  * Only target release branches if you are certain your fix must be on that
    branch.
  * To quickly create a topic branch based on the development branch; `git 
    checkout -b fix/master/my_contribution branch`. Please avoid working 
    directly on the `active development` branch.
* Make commits of logical units.
* Check for unnecessary whitespace with `git diff --check` before committing.
* Make sure your commit messages are in the proper format.

````
    (#12345) Make the example in CONTRIBUTING imperative and concrete

    Without this patch applied the example commit message in the CONTRIBUTING
    document is not a concrete example.  This is a problem because the
    contributor is left to imagine what the commit message should look like
    based on a description rather than an example.  This patch fixes the
    problem by making the example concrete and imperative.

    The first line is a real life imperative statement with a ticket number
    from our issue tracker.  The body describes the behavior without the patch,
    why this is a problem, and how the patch fixes the problem when applied.
````
* Always fully test your changes. If they are large engouh in scope, then fully
	test Eac.
* Describing the process you used to test your changes in detail will help speed
  up this process.

## Making Trivial Changes

### Documentation

For changes of a trivial nature to comments and documentation, it is not
always necessary to create a new issue. In this case, it is
appropriate to start the first line of a commit with '(doc)' instead of
a ticket number.

````
    (doc) Add documentation commit example to CONTRIBUTING

    There is no example for contributing a documentation commit
    to the Puppet repository. This is a problem because the contributor
    is left to assume how a commit of this nature may appear.

    The first line is a real life imperative statement with '(doc)' in
    place of what would have been the ticket number in a
    non-documentation related commit. The body describes the nature of
    the new documentation or comments added.
````

### Semantic Changes

In order to keep the code in a state where PRs can be safely merged, it is important to
avoid changes to syntax or changes that don't add any real value to the code base. PRs
that make changes only to syntax or "clean up" the code will be rejected. Any code clean-up
should be coordinated with the core team first.


## Style Guidelines

Enders Aerial Cast does not follow standard Java syntax. The guidelines below illustrate
the styling guidelines used by Eac. 

PRs that do not conform to these standards will be rejected.

### Whitespace

#### Tabs or spaces
Configure your IDE to use tabs as padding whitespace. Ensure that there is no extra whitespace 
at the end of lines, or on blank lines.

#### Pad parenthes with whitespace
````
if( item.equals( newItem )

public void DeleteItem( item )

catch( Throwable )
````

### Braces

Place closing braces on a new line. Always include open and close braces, even if
the body is a single line.

````
if( item.equals( newItem ){

}
else{

}

public void DeleteItem( item ){

}

````

## Submitting Changes

* Push your changes to a topic branch in your fork of the repository.
* Submit a pull request to the repository in the puppetlabs organization.
* Update your issue to mark that you have submitted code and are ready for it to be reviewed.
  * Include a link to the pull request in the ticket.
* The core team looks at Pull Requests on a regular basis.
  * There are many reasons why it will take a long time to pull your PR. Be patient, we'll
    get to it.
* After feedback has been given we expect responses within two weeks. After two
  weeks Abchrisabc may close the pull request if it isn't showing any activity.

# Additional Resources

* [General GitHub documentation](http://help.github.com/)
* [GitHub pull request documentation](http://help.github.com/send-pull-requests/)
* #Eac Irc channel on irc.the-eac.nl
