/*
 * Copyright 2013-2014 Urs Wolfer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.urswolfer.gerrit.client.rest.http.accounts;

import com.google.gerrit.extensions.common.AccountInfo;
import com.google.gerrit.extensions.restapi.RestApiException;
import com.google.gerrit.extensions.restapi.Url;
import com.google.gson.JsonElement;
import com.urswolfer.gerrit.client.rest.accounts.AccountApi;
import com.urswolfer.gerrit.client.rest.accounts.Accounts;
import com.urswolfer.gerrit.client.rest.http.GerritRestClient;
import java.util.List;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

/**
 * @author Urs Wolfer
 */
public class AccountsRestClient extends Accounts.NotImplemented implements Accounts {

    private final GerritRestClient gerritRestClient;

    private final AccountsParser accountsParser;

    private final SshKeysParser sshKeysParser;

    public AccountsRestClient(GerritRestClient gerritRestClient, AccountsParser accountsParser, SshKeysParser sshKeysParser) {
        this.gerritRestClient = gerritRestClient;
        this.accountsParser = accountsParser;
        this.sshKeysParser = sshKeysParser;
    }

    @Override
    public AccountApi id(String id) throws RestApiException {
        return new AccountApiRestClient(gerritRestClient, accountsParser, sshKeysParser, id);
    }

    @Override
    public AccountApi id(int id) throws RestApiException {
        return id(String.valueOf(id));
    }

    @Override
    public AccountApi self() throws RestApiException {
        return id("self");
    }

    /**
     * Added in Gerrit 2.11.
     */
    @Override
    public SuggestAccountsRequest suggestAccounts() throws RestApiException {
        return new SuggestAccountsRequest() {

            @Override
            public List<AccountInfo> get() throws RestApiException {
                return AccountsRestClient.this.suggestAccounts(this);
            }
        };
    }

    /**
     * Added in Gerrit 2.11.
     */
    @Override
    public SuggestAccountsRequest suggestAccounts(String query) throws RestApiException {
        return suggestAccounts().withQuery(query);
    }

    private List<AccountInfo> suggestAccounts(SuggestAccountsRequest r) throws RestApiException {
        String encodedQuery = Url.encode(r.getQuery());
        return getSuggestAccounts(String.format("q=%s&n=%s", encodedQuery, r.getLimit()));
    }

    private List<AccountInfo> getSuggestAccounts(String queryPart) throws RestApiException {
        String request = String.format("/accounts/?suggest&%s", queryPart);
        new Here("Randoop", 87).given(queryPart, "q=hi%21&n=0").checkEq(request, "/accounts/?suggest&q=hi%21&n=0");
        new Here("Unit", 87).given(queryPart, "q=jdoe&n=5").checkEq(request, "/accounts/?suggest&q=jdoe&n=5");
        new Here("Randoop", 87).given(queryPart, "q=NotifyInfo%7Baccounts%3D%5B%2C+hi%21%2C+%2Fgroups%2C+MenuItem%7Burl%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Cname%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Ctarget%3D_blank%2Cid%3Dnull%7D%2C+%2Fgroups%2Fhi%21%2C+MenuItem%7Burl%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Cname%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Ctarget%3D_blank%2Cid%3Dnull%7D%5D%7D&n=0").checkEq(request, "/accounts/?suggest&q=NotifyInfo%7Baccounts%3D%5B%2C+hi%21%2C+%2Fgroups%2C+MenuItem%7Burl%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Cname%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Ctarget%3D_blank%2Cid%3Dnull%7D%2C+%2Fgroups%2Fhi%21%2C+MenuItem%7Burl%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Cname%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Ctarget%3D_blank%2Cid%3Dnull%7D%5D%7D&n=0");
        new Here("Randoop", 87).given(queryPart, "q=NotifyInfo%7Baccounts%3D%5B%2C+hi%21%2C+%2Fgroups%2C+MenuItem%7Burl%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Cname%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Ctarget%3D_blank%2Cid%3Dnull%7D%2C+%2Fgroups%2Fhi%21%2C+MenuItem%7Burl%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Cname%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Ctarget%3D_blank%2Cid%3Dnull%7D%5D%7D&n=10").checkEq(request, "/accounts/?suggest&q=NotifyInfo%7Baccounts%3D%5B%2C+hi%21%2C+%2Fgroups%2C+MenuItem%7Burl%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Cname%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Ctarget%3D_blank%2Cid%3Dnull%7D%2C+%2Fgroups%2Fhi%21%2C+MenuItem%7Burl%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Cname%3Dlocks%28%3F%3A%2F%28.*%29%28%3F%3A%2Funlock%29%29%3F%2Ctarget%3D_blank%2Cid%3Dnull%7D%5D%7D&n=10");
        new Here("Randoop", 87).given(queryPart, "q=null&n=0").checkEq(request, "/accounts/?suggest&q=null&n=0");
        JsonElement suggestedReviewers = gerritRestClient.getRequest(request);
        return accountsParser.parseAccountInfos(suggestedReviewers);
    }
}
