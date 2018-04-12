# Project
In this Coffee Machine Project, your task is to implement the logic (starting from a simple class) that translates orders from customers of the coffee machine to the drink maker. Your code will use the drink maker protocol to send commands to the drink maker.

# First iteration - Making drinks

In this iteration, your task is to implement the logic (starting from a simple class) that translates orders from customers of the coffee machine to the drink maker. Your code will use the drink maker protocol (see below) to send commands to the drink maker.

The coffee machine can serves 3 type of drinks: tea, coffee, chocolate.
## Use cases
Your product owner has delivered the stories and here they are:
- The drink maker should receive the correct instructions for my coffee / tea / chocolate order
- I want to be able to send instructions to the drink maker to add one or two sugars
- When my order contains sugar the drink maker should add a stick (touillette) with it
## Drink maker protocol
The drink maker receives string commands from your code to make the drinks. It can also deliver info messages to the customer if ordered so. The instructions it receives follow this format:

    "T:1:0" (Drink maker makes 1 tea with 1 sugar and a stick)
    "H::" (Drink maker makes 1 chocolate with no sugar and therefore no stick)
    "C:2:0" (Drink maker makes 1 coffee with 2 sugars and a stick)
    "M:message-content" (Drink maker forwards any message received onto the coffee machine interface for the customer to see)

# Second iteration - Going into business
The coffee machine is not free anymore! One tea is 0,4 euro, a coffee is 0,6 euro, a chocolate is 0,5 euro.

The drink maker will now only make a drink if enough money is given for it

## Use cases
- The drink maker should make the drinks only if the correct amount of money is given
- If not enough money is provided, we want to send a message to the drink maker. The message should contains at least the amount of money missing.
## Important
Remember that the drink maker forwards any message received onto the coffee machine interface for the customer to see.

If too much money is given, the drink maker will still make the drink according to the instructions. The machine will handle the return of the correct change. So do not worry about that.

You don't need to worry if there is too much money inserted. Just make sure, the minimum amount of money is set.

# Third iteration - Extra hot

The machine has been upgraded and the drink maker is now able to make orange juice and to deliver extra hot drinks. You have to update your code to send the correct messages to the drink maker so that users can have orange juices or extra hot drinks

Let us see if your implementation is flexible enough to welcome those changes with not too much hassle.
# Use cases
- I want to be able to buy a orange juice for 0,6 euro
- I want to be able to have my coffee, chocolate or tea extra hot
# Implementation details
Here are the new protocol commands added to the new firmware of the drink maker:

    "O::" (Drink maker will make one orange juice)
    "Ch::" (Drink maker will make an extra hot coffee with no sugar)
    "Hh:1:0" (Drink maker will make an extra hot chocolate with one sugar and a stick)
    "Th:2:0" (The drink maker will make an extra hot tea with two sugar and a stick)
    
# Fourth iteration - Making money

The machine is becoming popular in the office. The management is eager to have daily reports of what is sold and when.

## Use cases
- I want to be able to print a report anytime that contains: how many of each drink was sold and the total amount of money earned so far.

##Implementation details
For the reporting, you can have a repository of data with a simple data structure in memory. A simple reporting can be done by printing to the console. Of course all of that should be tested before it is written, but you know that already, don't you ? ;)

# Fifth iteration - Running out
The users of the coffee machine are complaining that there is often shortages of water and/or milk. It takes weeks before the machine is refilled.

Your product owner wants to you to take advantage of the machine capabilities to inform the user that there is a shortage and to send a email notification to the company so that they can come and refill the machine.
## Use cases
When I order a drink and it can be delivered because of a shortage, I want to see a message to the coffee machine console that indicates me the shortage and that a notification has been sent
## Implementation details
You can take advantages of the 2 services implemented by the coffee machine:

    public interface EmailNotifier {
	    void notifyMissingDrink(String drink)
    }
    
    public interface BeverageQuantityChecker {
	    boolean isEmpty(String drink)
    }