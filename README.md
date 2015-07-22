bowling-game
    bowling-core
    bowling-ui


### bowling-core
+ controllers
+ services
+ gamingzone
    - game.start()
        - player.play() // person who plays and uses turn for storing state
            - turn // for storing state of any player
        - scorer // interface to define scoring strategy
            - FairPlayStrategy.calculateScore()
        - scoreboard // interface to maintain scoreboard updated at any point of time
            - SimpleScoreboard
            - InMemoryScoreboard
