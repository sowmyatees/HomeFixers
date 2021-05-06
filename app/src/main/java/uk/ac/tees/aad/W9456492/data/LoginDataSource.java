package uk.ac.tees.aad.W9456492.data;

import uk.ac.tees.aad.W9456492.data.model.LoggedInUser;

import java.io.IOException;

public class LoginDataSource {

    public Result<LoggedInUser> login(String username, String password) {

        try {

            LoggedInUser fakeUser =
                    new LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {
        // TODO: revoke authentication
    }
}
