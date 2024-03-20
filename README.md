# QLearning

Credit: 
[https://technobium.com/reinforcement-learning-q-learning-java/](url)
[https://towardsdatascience.com/simple-reinforcement-learning-q-learning-fcddc4b6fe56](url)

What is Q Learning? What does the Q stand for (and what about the "Learning")?
Q learning is a model-free, value-based, off-policy algorithm that will find the best series of actions based on the agent's current state. The Q in Q learning stands for quality.

What is RL (Reinforcement Learning) and how does it relate to ML (Machine Learning)?
RL and ML are both kinds of AI. RL uses random trial and error and receives rewards or penalties based on its output. The RL model tries to maximize its reward. ML uses labeled and unlabeled pairs.

What does it mean for Q Learning to be "model-free"?
RL is model-free because it does not learn any models and only uses the q-values of actions.

What, if anything, is Q Learning often used for? (If you find any cool projects or research relating to Q Learning, feel free to link them to me!)
Navigation apps like Google Maps or Apple Maps, particularly directional navigation

**Maze Class**

*The Maze class is responsible for generating a maze and saving it to a file.*

Maze Generation: 
The generate() method randomly selects positions for penalty and finish symbols within the maze.

Maze Representation: 
The maze is represented as a 2D array of characters. Each cell can contain a penalty ('X'), finish ('F'), or empty ('0') symbol.

Output: 
The outputMaze() method converts the maze array to a string and writes it to a file named "maze.txt".

**QLearning Class**
*The QLearning class implements Q-learning algorithm to solve the maze problem.*

Initialization: 
The init() method initializes the Q-learning algorithm by reading the maze from the "maze.txt" file and setting up the reward and Q matrices.

Training: 
The calculateQ() method trains the Q-learning algorithm by updating Q values based on rewards received during exploration.

Policy Determination: 
The printPolicy() method determines the optimal policy for each state based on learned Q values.

Output Q Matrix: 
The printQ() method writes the learned Q values to a file named "Q-matrix.txt".

**Running the Code**
To run the code:

Compile the Java files: 
Maze.java 
QLearning.java.

Run the main method in QLearning class.
After execution, you can find the generated maze in "maze.txt" and the coinciding Q matrix in "Q-matrix.txt".
