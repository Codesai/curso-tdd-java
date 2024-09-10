Birthday Greetings
==================

As you’re a very friendly person, you would like to send a birthday note to all the friends you have. But you have a lot of friends and a bit lazy, it may take some times to write all the notes by hand.

The good news is that computers can do it automatically for you.

Imagine you have a flat file with all your friends :

     last_name, first_name, date_of_birth, email
     Doe, John, 1982/10/08, john.doe@foobar.com
     Ann, Mary, 1975/09/11, mary.ann@foobar.com


And you want to send them a happy birthday email on their birthdate :

     Subject: Happy birthday!
    
     Happy birthday, dear <first_name>!


Constraints
------
The signature of the only public method in the entry point must be => `void send(Date today)`


Origin
------

This kata is largely inspired by the work of Matteo Vaccari in [http://matteo.vaccari.name/blog/archives/154](http://matteo.vaccari.name/blog/archives/154)
