SUMMARY="An image to deploy the playbox"
HOMEPAGE="https://github.com/bernedom/meta-playbox"

inherit image

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL += "\ 
    playbox \
    docker-ce \
    packagegroup-core-ssh-openssh \
    wpa-supplicant \
"

# for a root passwd, change 'password' below to your password
INHERIT += "extrausers"
EXTRA_USERS_PARAMS = "usermod -P password root; "

# this will force root to change password on first login
#INHERIT += "chageusers"
#CHAGE_USERS_PARAMS = "chage -d0 root; "


export IMAGE_BASENAME = "playbox-image"