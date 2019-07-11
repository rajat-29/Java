class contactManager
{

  contactManager [] myFriends;
  int friendCount;
  String name;
  String phoneNumber;

  contactManager()
  {
    friendCount = 0;
    myFriends = new contactManager[500];
  }

  void addContact(contactManager contact)
  {
    myFriends[friendCount] = contact;
      friendCount++;
  }


  contactManager searchContact(String searchName){
      for(int i=0; i<friendCount; i++){
         if(myFriends[i].name.equals(searchName)){
            return myFriends[i];
         }
      }
      return null;
   }

  public static void main(String [] args)
  {
    contactManager mycontact = new contactManager();

    contactManager friendJames = new contactManager();
  // Set the fields
    friendJames.name = "James";
    friendJames.phoneNumber = "0012223333";
  // Add James Contact to the ContactsManager
    mycontact.addContact(friendJames);

    contactManager friendRajat = new contactManager();
  // Set the fields
    friendRajat.name = "Rajat";
    friendRajat.phoneNumber = "0987654321";
  // Add James Contact to the ContactsManager
    mycontact.addContact(friendRajat);

    contactManager result = mycontact.searchContact("Rajat");
    System.out.print(result.phoneNumber);
  }
}
