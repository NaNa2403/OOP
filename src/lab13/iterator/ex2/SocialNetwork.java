package lab13.iterator.pseudocode;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);
}
