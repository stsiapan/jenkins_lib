def calling(args) {
    assert args != null
    sh(script: "sudo docker ${args}")
}
