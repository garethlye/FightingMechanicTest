package PlayerInfo;

import javax.inject.Singleton;

import dagger.Module;
import Character.PlayerCharacter;
import dagger.Provides;

/**
 * Created by garethlye on 07/04/2017.
 */

@Module
public class PlayerModule {

    private final PlayerCharacter mPlayerCharacter;

    public PlayerModule(final PlayerCharacter playerCharacter){
        mPlayerCharacter = playerCharacter;
    }

    @Provides
    @Singleton
    PlayerCharacter getPlayerCharacter(){
        return mPlayerCharacter;
    }

}
