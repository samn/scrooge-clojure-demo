struct DogInfoRequest {
    1: list<string> dogBreeds
}

struct DogInfoResponse {
    1: list<string> cuteBreeds
}

service DogInfoService {
    DogInfoResponse onlyCuteDogs(1: DogInfoRequest req)
}
