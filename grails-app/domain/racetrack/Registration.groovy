package racetrack

class Registration {
	static belongsTo = [race:Race, runner:Runner]

	Date dateCreated
	Boolean paid

	static constraints = {
		race()
		runner()
		paid()
		dateCreated()
	}

	static mapping = {
/*		autoTimestamp false*/
	}
	def beforeInsert = {
		// your code goes here
	}
 	def beforeUpdate = {
		// your code goes here
	}
 	def beforeDelete = {
		// your code goes here
	}
 	def onLoad = {
		// your code goes here
	}
}
