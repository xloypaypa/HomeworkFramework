# HomeworkFramework
It's a simple framework for pc app.

## How to use this framework
There are some important class or interface.
  * In model:
    * About Type:
      * Type. It's a default class to save data. So you should extends this class for any class like "BookMessage" or "StudentMessage".
         * If you don't want use this class save to database, you can use the interface IOType.
         * If you try to use this class. You just need use addMessage(String title, String message); to set a title's message. If there are same title, the message would be repleace by new message.
      * IOType. It's a interface. There are two methods.
         * format is used to format class's data to String.
         * solveMessage is used to solve String to data.(Just like parse).
    * About database:
      * IOInterface. It's a interface. It's define all method a database need. So you should implement this interface when you use a database(Like MongoDb). But it's ok to not use database.
      * IOManager. After you implement IOInterface, you should set IOmanager.io as your class. And use IOManager's operations.
      * DataBase and IDDataBase. They are two interfaces. They define your db's operations.
      * OperatorManager and DBOperatorManager. They are used to save all your database.
  * In control:
    * About listener:
      * LogicMessageListener and ListenerManager. 
        * It's could save logic's message. And you should implement UIAction(). And save your class in LogicMessageListener.
        * So in some event. When you need to send message to user. You chould setErrorMessage(or setOKMessage), and use method "UIAction".
      * NormalEvent, AbstractSteep and AbstractAction.
        * Steep could return a boolean. if return false, Event would be break. So if you want to check something before action, you could implement this iterface. And when checked fail, you can use ListenerManager to send message to user.
        * action is a implement of steep. It's couldn't return false. So you can do your operation in this class.
        * event is made of steeps(also actions).
  * In view:
    * InterfaceTool is some tools of UI.
    * UI is the main class of UI.
      * It's should be getInstance before createWindow, addDialog and addPage.
      * You can call showPage(or showDialog) to show a page(or a dialog).
    * UIPage and UIDialog. They a page and dialog's iterface. Any page and dialog should implement they. And add to UI.
    
## Why use this framework
   * If you are worry about a db homework and you don't want build a web app and you don't want your homework not too simple and you don't want it's too hard. You could try this.
   * As you see. It's don't have too many class or interface have to learn.
   * It's build by java absolutely. So you can use this framework in any system who have jvm.
