import grails.util.GrailsUtil

class BootStrap {

	def init = { servletContext ->
		switch(GrailsUtil.environment){
			case "development":
				def admin = new racetrack.User(login:"admin",
                                    password:"wordpass",
                                    role:"admin")
                admin.save()
				if(admin.hasErrors()){
					println admin.errors
				}
				def jdoe = new racetrack.User(login:"jdoe",
                                   password:"password",
                                   role:"user")
				jdoe.save()
				if(jdoe.hasErrors()){
					println jdoe.errors
				}
				def trot = new racetrack.Race(
                   name:"Turkey Trot",
                   startDate:(new Date() + 90),
                   city:"Duck",
                   state:"NC",
                   distance:5.0,
                   cost:20.0,
                   maxRunners:350
                   )
				trot.save()
				if(trot.hasErrors()){
				  println trot.errors
				}
				def burner = new racetrack.Race(
		           name:"Barn Burner",
		           startDate:(new Date() + 120),
		           city:"Cary",
		           state:"NC",
		           distance:10.0,
		           cost:15.0,
		           maxRunners:350
            	)
				burner.save()
				if(burner.hasErrors()){
				   println burner.errors
				}
				def chase = new racetrack.Race(
		            name:"Race for the Chase",
		            startDate:(new Date() + 150),
		            city:"Duck",
		            state:"NC",
		            distance:5.0,
		            cost:25.0,
		            maxRunners:350
				)
				chase.save()
				if(chase.hasErrors()){
				   println chase.errors
				}

				def jane = new racetrack.Runner(
                       firstName:"Jane",
                       lastName:"Doe",
                       dateOfBirth:(new Date() - 365*30),
                       gender:"F",
                       address:"123 Main St",
                       city:"Goose",
                       state:"NC",
                       zipcode:"12345",
                       email:"jane@whereever.com"
                       )
				jane.save()
				if(jane.hasErrors()){
				  println jane.errors
				}
				def reg = new racetrack.Registration(
                  paid:false,
                  runner:jane,
                  race:trot
                  )
				reg.save()
				if(reg.hasErrors()){
				  println reg.errors
				}
				break
				
				case "production" : break
			} // end of swith env
	}
	def destroy = {
	}
} 