create table accounts
(
    account_id      bigint auto_increment
        primary key,
    account_name    varchar(50)  not null,
    email_address   varchar(255) not null,
    password_digest varchar(255) not null,
    created_at      datetime     not null,
    updated_at      datetime     not null,
    constraint index_accounts_on_account_name
        unique (account_name),
    constraint index_accounts_on_email_address
        unique (email_address)
);

create table account_activations
(
    account_id        bigint               not null,
    activation_digest varchar(255)         not null,
    activated         tinyint(1) default 0 not null,
    created_at        datetime             not null,
    updated_at        datetime             not null,
    constraint index_account_activations_on_account_id
        unique (account_id),
    constraint fk_rails_d7d52ac162
        foreign key (account_id) references accounts (account_id)
);

create index index_account_activations_on_activated
    on account_activations (activated);

create table account_cookies
(
    account_id      bigint       not null,
    remember_digest varchar(255) not null,
    created_at      datetime     not null,
    updated_at      datetime     not null,
    constraint index_account_cookies_on_account_id
        unique (account_id),
    constraint fk_rails_a09f491abe
        foreign key (account_id) references accounts (account_id)
);

create table account_relationships
(
    account_relationship_id bigint auto_increment
        primary key,
    follower_account_id     bigint   not null,
    followed_account_id     bigint   not null,
    created_at              datetime not null,
    updated_at              datetime not null,
    constraint index_account_relationships_on_followed_and_follower
        unique (followed_account_id, follower_account_id),
    constraint index_account_relationships_on_follower_and_followed
        unique (follower_account_id, followed_account_id)
);

create table account_resets
(
    account_id   bigint       not null,
    reset_digest varchar(255) not null,
    created_at   datetime     not null,
    updated_at   datetime     not null,
    constraint index_account_resets_on_account_id
        unique (account_id),
    constraint fk_rails_7312fec1e5
        foreign key (account_id) references accounts (account_id)
);

create table lunches
(
    lunch_id   bigint auto_increment
        primary key,
    account_id bigint       not null,
    lunch_date date         not null,
    comment    varchar(255) null,
    created_at datetime     not null,
    updated_at datetime     not null,
    constraint fk_rails_38eef2a231
        foreign key (account_id) references accounts (account_id)
);

create index index_lunches_on_account_id_and_created_at
    on lunches (account_id, created_at);

create index index_lunches_on_account_id_and_lunch_date
    on lunches (account_id, lunch_date);
