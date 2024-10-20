package pe.upc.connexbackend.users.interfaces.rest.resources;

public record CreateInfluencerResource(
        String email,
        String password,
        String status,
        String firstName,
        String lastName,
        String phoneNumber,
        String socialMediaHandle
) {
}
